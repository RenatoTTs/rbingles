package en.cliente;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class WebViewText extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		WebView webView = new WebView();
		
		webView.getEngine().load("http:\\globo.com");
		
		stage.setScene(new Scene(webView));
		
		stage.show();
		
	}

}
