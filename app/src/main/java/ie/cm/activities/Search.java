package ie.cm.activities;

import ie.cm.R;
import ie.cm.fragments.CoffeeFragment;
import ie.cm.fragments.SearchFragment;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Search extends Base {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);



	}

	@Override
	protected void onResume() {
		super.onResume();

		coffeeFragment = SearchFragment.newInstance(); //get a new Fragment instance
		getFragmentManager()
				.beginTransaction()
				.replace(R.id.fragment_layout, coffeeFragment)
				.commit(); // add/replace in the current activity
	}
}
