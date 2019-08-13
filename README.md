
# react-native-react-native-vcrx-poseidon

## Getting started

`$ npm install react-native-react-native-vcrx-poseidon --save`

### Mostly automatic installation

`$ react-native link react-native-react-native-vcrx-poseidon`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-native-vcrx-poseidon` and add `RNReactNativeVcrxPoseidon.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeVcrxPoseidon.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeVcrxPoseidonPackage;` to the imports at the top of the file
  - Add `new RNReactNativeVcrxPoseidonPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-vcrx-poseidon'
  	project(':react-native-react-native-vcrx-poseidon').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-vcrx-poseidon/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-vcrx-poseidon')
  	```
## Android Manual Install

1.) In `android/app/src/main/AndroidManifest.xml` add these permissions

```xml
<uses-permission android:name="android.permission.CAMERA" />
<uses-feature android:name="android.hardware.camera" />
<uses-feature android:name="android.hardware.camera.autofocus"/>

<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS" />
<uses-permission android:name="android.permission.RECORD_AUDIO" />
<uses-permission android:name="android.permission.WAKE_LOCK" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<permission android:name="${applicationId}.permission.JITSI_BROADCAST"
    android:label="Jitsi Meet Event Broadcast"
    android:protectionLevel="normal"></permission>
<uses-permission android:name="${applicationId}.permission.JITSI_BROADCAST"/>
```

2.) In the `<application>` section of `android/app/src/main/AndroidManifest.xml`, add
 ```xml
 <activity android:name="com.reactnativejitsimeet.JitsiMeetNavigatorActivity" />
 ```
 
3.) In `android/settings.gradle`, include react-native-jitsi-meet module
```gradle
include ':react-native-jitsi-meet'
project(':react-native-jitsi-meet').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-jitsi-meet/android')
```

4.) In `android/app/build.gradle`, add react-native-jitsi-meet to dependencies
```gradle
dependencies {
  ...
    implementation(project(':react-native-jitsi-meet'))
}
```
and add/replace the following lines:

```
project.ext.react = [
    entryFile: "index.js",
    bundleAssetName: "app.bundle",
]
```

5.) In `android/build.gradle`, add the following code 
```
allprojects {
    repositories {
        mavenLocal()
        jcenter()
        maven {
            // All of React Native (JS, Obj-C sources, Android binaries) is installed from npm
            url "$rootDir/../node_modules/react-native/android"
        }
        maven {
            url "https://maven.google.com"
        }
        maven { // <---- Add this block
            url "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases"
        }
        maven { url "https://jitpack.io" }
    }
}
```

6.) In `android/app/src/main/java/com/xxx/MainApplication.java`

```java
import com.reactnativejitsimeet.JitsiMeetPackage;  // <--- Add this line
...
    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        new MainReactPackage(),
        new JitsiMeetPackage()                  // <--- Add this line
      );
    }
```

7.) In `android/app/src/main/java/com/xxx/MainApplication.java` add/replace the following methods:

```
    @Override
    protected String getJSMainModuleName() {
      return "index";
    }

    @Override
    protected @Nullable String getBundleAssetName() {
      return "app.bundle";
    }
```

### Side-note

If your app already includes `react-native-locale-detector` or `react-native-vector-icons`, you must exclude them from the `react-native-jitsi-meet` project implementation with the following code:

```
    implementation(project(':react-native-jitsi-meet')) {
      exclude group: 'com.facebook.react',module:'react-native-locale-detector'
      exclude group: 'com.facebook.react',module:'react-native-vector-icons'
    }
```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeVcrxPoseidon.sln` in `node_modules/react-native-react-native-vcrx-poseidon/windows/RNReactNativeVcrxPoseidon.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Vcrx.Poseidon.RNReactNativeVcrxPoseidon;` to the usings at the top of the file
  - Add `new RNReactNativeVcrxPoseidonPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactNativeVcrxPoseidon from 'react-native-react-native-vcrx-poseidon';

// TODO: What to do with the module?
RNReactNativeVcrxPoseidon;
```
  # react-native-vcrx-poseidon
