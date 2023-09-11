# Local Content WebView Loader

This repository serves as a sample Local Content WebView Loader. It can also
serve as a testing tool for projects that export static files and meant to be
packaged into a native Android app.

It is for the above stated reason that `app/src/main/assets/` has been 
explicitly ignored or excluded. To view a working code, checkout the very first
commit.

The path to be used in the `app/src/main/assets/` can be any of the two:

- `./`
- `file://android_asset/`

and this includes the css and javascript resources.


## How to Use

* Install Android Studio
* Open the directory where you cloned this repository
  * Wait for Android Studio to detect and install all the needed files to run the project.
* *Copy the static files you need to test into `app/src/main/assets/`*
* Define and use a script to adjust the base path of the resources needed by the static files.
* Build > Make Project 
  * CMD+F9 (Mac OS)
    * Android Studio will prompt for settings
      * Choose defaults
      * Choose one emulator
* Run > Run 'app'
  * CTRL-R (Mac OS)
    * Pick any default emulator