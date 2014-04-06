/*
 * Copyright 2007 Thomas Stock.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Contributors:
 *
 */
package net.sourceforge.jwbf.mediawiki.live;

import static net.sourceforge.jwbf.TestHelper.assumeReachable;
import static net.sourceforge.jwbf.mediawiki.LiveTestFather.getValue;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.mediawiki.BotFactory;
import net.sourceforge.jwbf.mediawiki.VersionTestClassVerifier;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLoginOld;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

/**
 * Test Login.
 * 
 * @author Thomas Stock
 */
public class LoginTest extends AbstractMediaWikiBotTest {

  // TODO what about PostLogin.class
  @ClassRule
  public static VersionTestClassVerifier classVerifier = new VersionTestClassVerifier(
      PostLoginOld.class);

  @Rule
  public Verifier successRegister = classVerifier.getSuccessRegister(this);

  /**
   * Test login on Wikipedia.
   * 
   * @throws Exception
   *           a
   */
  @Test
  public final void loginWikipedia1() throws Exception {
    String liveUrl = getValue("login_wikipedia1_url");
    assumeReachable(liveUrl);
    bot = new MediaWikiBot(liveUrl);
    bot.login(getValue("login_wikipedia1_user_valid"),
        getValue("login_wikipedia1_pass_valid"));
    assertTrue(bot.isLoggedIn());
  }

  /**
   * Test login on Wikipedia.
   * 
   * @throws Exception
   *           a
   */
  @Test
  public final void loginWikipedia1Urlformats() throws Exception {

    String liveUrl = getValue("login_wikipedia1_url");
    int lastSlash = liveUrl.lastIndexOf("/");
    liveUrl = liveUrl.substring(0, lastSlash + 1);
    assumeReachable(liveUrl);
    bot = new MediaWikiBot(liveUrl);
    bot.login(getValue("login_wikipedia1_user_valid"),
        getValue("login_wikipedia1_pass_valid"));
    assertTrue(bot.isLoggedIn());
  }

  /**
   * Test FAIL login on Wikipedia.
   * 
   * @throws Exception
   *           a
   */
  @Test(expected = ActionException.class)
  public final void loginWikipedia1Fail() {

    String liveUrl = getValue("login_wikipedia1_url");
    assumeReachable(liveUrl);
    bot = new MediaWikiBot(liveUrl);
    bot.login("Klhjfd", "4sdf");
    assertFalse("Login does not exist", bot.isLoggedIn());

  }

  /**
   * Test login on a Mediawiki.
   * 
   * @throws Exception
   *           a
   */
  @Test
  public final void loginWikiMW1x09() throws Exception {
    bot = BotFactory.getMediaWikiBot(MW1_09, true);
    assertTrue(bot.isLoggedIn());
  }

  /**
   * Test FAIL login on Mediawiki. TODO change exception test, should fail if no
   * route to test host
   * 
   * @throws Exception
   *           a
   */
  @Test(expected = ActionException.class)
  public final void loginWikiMW1x09Fail() throws Exception {
    bot = BotFactory.getMediaWikiBot(MW1_09, false);
    bot.login("Klhjfd", "4sdf");

  }

  /**
   * Test login where the wiki is in a subfolder, like www.abc.com/wiki .
   * 
   * @throws Exception
   *           a
   */
  @Test(expected = MalformedURLException.class)
  public final void loginWikiMW1x09UrlformatsFail() throws Exception {

    String defektUrl = getValue("wikiMW1_09_url");
    int lastSlash = defektUrl.lastIndexOf("/");
    defektUrl = defektUrl.substring(0, lastSlash);
    assertFalse("shuld not end with .php", defektUrl.endsWith(".php"));
    bot = new MediaWikiBot(defektUrl);
    bot.login(getValue("wikiMW1_09_user"), getValue("wikiMW1_09_pass"));
  }

  /**
   * Test login on a Mediawiki.
   * 
   * @throws Exception
   *           a
   */
  @Test
  public final void loginWikiMW1x09Urlformats() throws Exception {
    String todoUrl = getValue("wikiMW1_09_url");
    int lastSlash = todoUrl.lastIndexOf("/");
    todoUrl = todoUrl.substring(0, lastSlash + 1);
    assertFalse("shuld not end with .php", todoUrl.endsWith(".php"));
    bot = new MediaWikiBot(todoUrl);
    bot.login(getValue("wikiMW1_09_user"), getValue("wikiMW1_09_pass"));
    assertTrue(bot.isLoggedIn());
  }

  /**
   * Test invalid installation of MW. TODO change exception test, should fail if
   * no route to test host
   * 
   * @throws Exception
   *           a
   */
  @Test(expected = ActionException.class)
  public final void installationDefunct() throws Exception {
    String invalidUrl = getValue("wikiMWinvalid_url");
    bot = new MediaWikiBot(invalidUrl);

    bot.login(getValue("wikiMW1_09_user"), getValue("wikiMW1_09_pass"));
  }

  /**
   * Test invalid installation of MW. TODO change exception test, should fail if
   * no route to test host
   * 
   * @throws Exception
   *           a
   */
  @Test(expected = ActionException.class)
  public final void conncetionProblem() throws Exception {
    String invalidUrl = "http://www.google.com/invalidWiki/";
    bot = new MediaWikiBot(invalidUrl);

    bot.login(getValue("wikiMW1_09_user"), getValue("wikiMW1_09_pass"));

  }

  /**
   * Test login on a Mediawiki.
   * 
   * @throws Exception
   *           a
   */
  @Test
  public final void loginWikiMWLast() throws Exception {

    Version latest = Version.getLatest();
    bot = BotFactory.getMediaWikiBot(latest, false);
    bot.login(BotFactory.getWikiUser(latest), BotFactory.getWikiPass(latest));
    assertTrue(bot.isLoggedIn());
  }

  /**
   * Login on last MW with SSL and htaccess.
   * 
   * @throws Exception
   *           a
   */
  @Test
  public final void loginWikiMWLastSSLAndHtaccess() throws Exception {

    AbstractHttpClient httpClient = getSSLFakeHttpClient();
    Version latest = Version.getLatest();

    URL u = new URL(getValue("wiki_url_latest").replace("http", "https"));

    assertEquals("https", u.getProtocol());
    int port = 443;
    {
      // test if authentication required
      HttpHost targetHost = new HttpHost(u.getHost(), port, u.getProtocol());
      HttpGet httpget = new HttpGet(u.getPath());
      HttpResponse resp = httpClient.execute(targetHost, httpget);

      assertEquals(401, resp.getStatusLine().getStatusCode());
      resp.getEntity().consumeContent();
    }

    httpClient.getCredentialsProvider().setCredentials(
        new AuthScope(u.getHost(), port),
        new UsernamePasswordCredentials(BotFactory.getWikiUser(latest),
            BotFactory.getWikiPass(latest)));

    HttpActionClient sslFakeClient = new HttpActionClient(httpClient, u);
    bot = new MediaWikiBot(sslFakeClient);

    bot.login(BotFactory.getWikiUser(latest), BotFactory.getWikiPass(latest));
    assertTrue(bot.isLoggedIn());
  }

  private AbstractHttpClient getSSLFakeHttpClient()
      throws NoSuchAlgorithmException, KeyManagementException {
    SSLContext sslContext = SSLContext.getInstance("SSL");
    sslContext.init(null, new TrustManager[] { new X509TrustManager() {
      public X509Certificate[] getAcceptedIssuers() {
        return null;
      }

      public void checkClientTrusted(X509Certificate[] certs, String authType) {
      }

      public void checkServerTrusted(X509Certificate[] certs, String authType) {
      }
    } }, new SecureRandom());

    SSLSocketFactory sf = new SSLSocketFactory(sslContext);
    sf.setHostnameVerifier(new X509HostnameVerifier() {

      public boolean verify(String hostname, SSLSession session) {
        return true;
      }

      public void verify(String host, String[] cns, String[] subjectAlts)
          throws SSLException {
      }

      public void verify(String host, X509Certificate cert) throws SSLException {
      }

      public void verify(String host, SSLSocket ssl) throws IOException {
      }
    });
    Scheme httpsScheme = new Scheme("https", sf, 443);
    SchemeRegistry schemeRegistry = new SchemeRegistry();
    schemeRegistry.register(httpsScheme);

    HttpParams params = new BasicHttpParams();

    ClientConnectionManager cm = new SingleClientConnManager(params,
        schemeRegistry);

    DefaultHttpClient httpClient = new DefaultHttpClient(cm, params);
    return httpClient;
  }

}
