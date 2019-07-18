package ie.cm.activities;

import ie.cm.R;
import ie.cm.fragments.CoffeeFragment;

import android.os.Bundle;

public class Favourites extends Base {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.favourites);
	}


	@Override
	protected void onResume() {
		super.onResume();

		coffeeFragment = CoffeeFragment.newInstance(); //get a new Fragment instance
		getFragmentManager()
				.beginTransaction()
				.replace(R.id.fragment_layout, coffeeFragment)
				.commit(); // add/replace in the current activity

	}
}
