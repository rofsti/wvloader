package dev.fsti.webviewloader;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.webkit.WebViewAssetLoader;

public class MainActivity extends AppCompatActivity {

    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.webView = (WebView) findViewById(R.id.webView);

        WebSettings webViewSettings = this.webView.getSettings();
        webViewSettings.setAllowFileAccess(true);
        webViewSettings.setAllowContentAccess(true);
        webViewSettings.setAllowFileAccessFromFileURLs(true);

        final WebViewAssetLoader assetLoader = new WebViewAssetLoader.Builder()
                .addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(this))
                .build();
        LocalContentWebViewClient webViewClient = new LocalContentWebViewClient(assetLoader);
        this.webView.setWebViewClient(webViewClient);

        this.webView.loadUrl("file:///android_asset/index.html");
    }
}