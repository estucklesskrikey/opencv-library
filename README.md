# Overview
This is an image recognition library that can be used for mobile application testing.

This library has been extracted and refactored from the following project: 
<https://github.com/bitbar/testdroid-samples/tree/master/image-recognition>

As this README is currently rather simplistic, more information can be found from the original project's readme or from this blog post: <http://bitbar.com/appium-tip-27-using-appium-for-mobile-game-testing>

# Prerequisites
## General

Appium

## Android
Android SDK

### Notes

```
export PATH=$PATH:$ANDROID_HOME/platform-tools/
export PATH=${PATH}:$ANDROID_HOME/tools/
```

## iOS

libimobiledevice

### Notes

```
brew uninstall libimobiledevice
brew install --HEAD libimobiledevice
```

# Getting started
Run Appium:

` appium` or `appium -U <udid>`


```
cd example
	
# Download the example Android application
wget https://github.com/bitbar/testdroid-samples/blob/master/apps/builds/BitbarSampleApp.apk -O application.apk
mvn -Dtest=AndroidSample clean test
	
# Download the example iOS application
wget https://github.com/bitbar/testdroid-samples/blob/master/apps/builds/BitbarIOSSample.ipa -O application.ipa
export UDID=<iPhone udid>
mvn -Dtest=iOSSample clean test
```
