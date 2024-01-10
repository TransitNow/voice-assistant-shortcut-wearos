# Google Assistant Go shortcut TicWatch Pro 3/5 users
<table>
<tr>
<td>


![image](https://github.com/TransitNow/voice-assistant-shortcut-wearos/assets/2457368/ba407c3a-61f5-4606-badf-9494c0db2cbd)

</td>
<td>
Allows TWP3/5 users to bind their Voice Assistant (long-press) shortcut to <a href="https://www.apkmirror.com/apk/google-inc/google-assistant-go/google-assistant-go-2-8-0-release/">Google Assistant Go 2.8</a>
</td>
</tr>
</table>

[Watch video for TicWatch Pro 3/5 users](https://youtu.be/lqnD2iWeQBI)


## How it works
- Long-press the voice shortcut (crown button for TWP5, bottom button for TWP3)
- If you have multiple voice assistants installed (like Alexa), you will be prompted to select one. Select Google Assistant Go.

## Alternative voice assistants
I actually prefer to use [Alexa for Wear OS](https://www.apkmirror.com/apk/amazon-mobile-llc/amazon-alexa-for-smart-watches-wear-os/) instead. It doesn't require this app to be installed. You simply sideload the apk and it works out of the box.

## Limitations
Assistant Go is a little cumbersome since it was designed for a Phone. Unfortunately, you cannot sideload the official Assistant apk for Wear OS.
You can run these adb commands to temporarily increase the pixel density to dismiss the blue banner at the bottom of the screen.
```
adb shell wm density 300
adb shell wm density reset
```
## How to install
### Install this app (voice app shortcut) and Google Assistant Go 2.8
- Install this apk (see Release page)
- Install [Google Assistant Go 2.8](https://www.apkmirror.com/apk/google-inc/google-assistant-go/google-assistant-go-2-8-0-release/) for this app to work properly.
- Enable all permissions. Go to Settings -> Applications -> Google Assistant Go -> Permissions -> Enable all permissions, allow system overlay as well.

## How to install (sideload) the apks?
### Option 1: via phone
- Download the [Wear installer 2](https://www.reddit.com/r/WearOS/comments/u9hf2m/new_app_wear_installer_2_a_free_general_purpose/) app on your phone.
- Follow their instructions on how to sideload the apk onto your watch.

### Option 2: via computer
- Install ADB on your PC or Mac. [Instructions](https://www.xda-developers.com/install-adb-windows-macos-linux/)
- Download the apk on to your computer.
- Connect your watch to your computer via USB
  - Enable developer mode on your watch
      - Tap 'System' -> 'About'.
      - Tap 'Build number' 7 times until you see a message that you are now a developer.
  - Go to Settings > Developer Options > ADB Debugging
  - Enable ADB Debugging and debug via WIFI
  - First pair your watch using the `adb connect <ip address:port>` command
  - Then, `adb connect <ip address:port>`
  - Run `adb devices` should show your watch
- Run `adb install <path to apk>`


## Beta Feedback
We welcome feedback on the beta version to improve the app. Please reach out with your comments and suggestions. 

Find my email on my [YouTube channel - https://www.youtube.com/@JSyntax](https://www.youtube.com/@JSyntax)  

## Support me by checking out my other apps
- [Cycle Now, a bike share app](https://cyclenowapp.com/) 
- [Transit Now, a TTC, MBTA, AC Transit bus predictions app](https://transitnowapp.com/)


