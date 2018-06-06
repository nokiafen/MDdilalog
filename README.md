# touble
# screenprint
![loading](https://github.com/nokiafen/touble/blob/master/gif/device-2018-06-06-173656.png)

# how to use
###  step 1 Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
###  Step 2. Add the dependency
    compile 'com.github.nokiafen:touble:0.0.2'

### simple demo 

    final Dialog   mDialog = new ShortDialog.Builder(this).setTitle("删除商家").setContentView(R.layout.view_dialog,layoutParams).setPositiveButton("A", R.color.colorPrimary,new ShortDialog.OnPositiveListener() {
                @Override
                public void onPositive(Dialog dialog) {
                    Toast.makeText(MainActivity.this,"heheh",Toast.LENGTH_LONG).show();
                }
            }).setNegativeButton("B",R.color.colorAccent, new OnNegativeListener() {
             @Override
             public void onNegative(Dialog dialog) {
                 Toast.makeText(MainActivity.this,"jjkksk",Toast.LENGTH_LONG).show();
             }
         }).create();

## dialog like ios  siba

#


