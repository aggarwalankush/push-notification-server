Push Notification Server
========================

This can be used to send Push Notification to iOS or Android Device.
  
### Android Push Notification

* ```SERVER_KEY``` - if you don't have SERVER_KEY, generate using [this tutorial](https://medium.com/@ankushaggarwal/gcm-setup-for-android-push-notifications-656cfdd8adbd) :tada:
* ```DEVICE_TOKEN``` - if you don't have device token, in case of Ionic 2, use [this tutorial](https://medium.com/@ankushaggarwal/push-notifications-in-ionic-2-658461108c59) or [this repo](https://github.com/aggarwalankush/ionic2-push-base) :+1:
* ```AndroidPush.java``` - run this file to push notification to Android device

  ```
  $ javac AndroidPush.java
  $ java  AndroidPush
  ```

### iOS Push Notification

* ```APNS certificate(.p12)``` - if you don't have .p12 certificate, generate using [this tutorial](https://medium.com/@ankushaggarwal/generate-apns-certificate-for-ios-push-notifications-85e4a917d522) :tada:
* ```DEVICE_TOKEN``` - if you don't have device token, in case of Ionic 2, use [this tutorial](https://medium.com/@ankushaggarwal/push-notifications-in-ionic-2-658461108c59) or [this repo](https://github.com/aggarwalankush/ionic2-push-base) :+1:
* ```IOSPush.java``` - run this file to push notification to iOS device

  ```
  $  javac -cp apns.jar:. IOSPush.java
  $  java  -cp apns.jar:. IOSPush 
  ```
