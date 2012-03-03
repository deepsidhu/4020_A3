package ca.joshadam;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import android.widget.Spinner;

public class A3_Activity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main);
		SlidingDrawer sd = (SlidingDrawer)findViewById(R.id.drawer);
		sd.bringToFront();
		LinearLayout l = (LinearLayout)findViewById(R.id.drawer_content);
		l.setBackgroundColor(Color.BLACK);

		// TODO: Import xml file first & get array list of genres
//		AssetManager am = getAssets();
//		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
//	    domFactory.setNamespaceAware(true); // never forget this!
//	    DocumentBuilder builder;
//	    Document doc;
//		try {
//			builder = domFactory.newDocumentBuilder();
//			doc = builder.parse(am.open("movies.xml"));
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// GENRE SELECT
		ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(
				this, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		adapter.add("some string data");
		adapter.add("Fred");
		Spinner spinGenre = (Spinner) findViewById(R.id.spinner_genres);
		spinGenre.setAdapter(adapter);

		// RATING SELECT
		ArrayAdapter<CharSequence> spinRatingAdapter = new ArrayAdapter<CharSequence>(
				this, android.R.layout.simple_spinner_item);
		spinRatingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinRatingAdapter.add("All");
		spinRatingAdapter.add("R");
		Spinner spinRating = (Spinner) findViewById( R.id.spinner_ratings );
		spinRating.setAdapter( spinRatingAdapter );
		
		// HANDLE SEARCH CLICK EVENT BY BRINGING TABLE TO FRONT
		final Button btn_search = (Button)findViewById(R.id.btn_search);
		btn_search.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			}
		});
	}
}
