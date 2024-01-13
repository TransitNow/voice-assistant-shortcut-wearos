# Google Assistant Go shortcut for TicWatch Pro 3/5 users
<table>
<tr>
<td>
  <img src="https://github.com/TransitNow/voice-assistant-shortcut-wearos/assets/2457368/ba407c3a-61f5-4606-badf-9494c0db2cbd" alt="image" width="100"/>

</td>
<td>
Allows TWP3/5 users to bind the native Voice Assistant shortcut to <a href="https://www.apkmirror.com/apk/google-inc/google-assistant-go/google-assistant-go-2-8-0-release/">Google Assistant Go 2.8</a>
</td>
</tr>
</table>

[Watch video for TicWatch Pro 3/5 users](https://youtu.be/lqnD2iWeQBI)


## How it works
- Long-press the voice shortcut (crown button for TWP5, bottom button for TWP3)
- If you have multiple voice assistants installed (like Alexa), you will be prompted to select one. Select this app "Voice assistant launcher"
  ![image](https://github.com/TransitNow/voice-assistant-shortcut-wearos/assets/2457368/a90e4f28-7ef6-465f-bc02-abab6b8fdad6)


## Alternative voice assistants
I would prefer to use [Alexa for Wear OS](https://www.apkmirror.com/apk/amazon-mobile-llc/amazon-alexa-for-smart-watches-wear-os/) instead. It doesn't require this app to be installed and is built for watch form factors. You simply sideload (install) the apk and it works out of the box. Unfortunately, Alexa is VERY SLOW to load initially (at least with the TWP3 hardware), so I tend to assign Google Assistant Go as my default voice assistant in the end, despite its shortcomings with screen size.
It's odd that Alexa for Wear OS is not available on the Play Store. I believe Wear OS 4 users have access to Wear OS (like GW6).

## Can I install the "official" Google Assistant for Wear OS?
Unfortunately, you cannot sideload the official Assistant apk for Wear OS (it's not compatible with the TWP3/5). This likely due to minimum Wear OS 4.0 requirement, perhaps licensing restrictions and hardware incompatabilities.

## Getting rid of the blue banner
Assistant Go is a little cumbersome since it was designed for a Phone. You may see a blue banner at the bottom of the screen.
To get rid off it, you'll need to temporarily increase the pixel density of your watch.
```
adb shell wm density 300 (play around with this number)
adb shell wm density reset
```

## Limitations
### ✔  Working
- Save notes to Keep
- Set reminders, timers, alarms, calendar events
- Calling a contact works
- Control smart home devices (no routines)

### ⚠ Known issues
- If your display turns off quickly (i.e < 15 seconds) and your interaction with Go takes longer, the screen will turn off. It's annoying, it seems the app doesn't keep the device screen on.
  - A workaround is to increase the screen timeout to 30 seconds or more, to rotate the crown to keep the screen on, or to tap the screen to keep it on.
- Navigating to a location doesn't work. It opens Google Maps but doesn't navigate to the location.
- Showing things like business hours/location, weather can be difficult to see due to limited screen real estate.

### ❓ Untested
- Sending SMS with my 3rd SMS app didn't work, but it may work with Google Messages (official app)

## How to install (sideload) apks
### Install this app (voice app shortcut) and Google Assistant Go 2.8
- Install this apk from the [release page](https://github.com/TransitNow/voice-assistant-shortcut-wearos/releases)
- Install [Google Assistant Go 2.8](https://www.apkmirror.com/apk/google-inc/google-assistant-go/google-assistant-go-2-8-0-release/) for this app to work properly.
- Enable all permissions. Go to Settings -> Applications -> Google Assistant Go -> Permissions -> Enable all permissions, allow system overlay as well.

## How to install (sideload) the apks?
### Option 1: via phone
- Download the [Wear installer 2](https://www.reddit.com/r/WearOS/comments/u9hf2m/new_app_wear_installer_2_a_free_general_purpose/) app on your phone.
- Follow their instructions on how to sideload the apk onto your watch.

### Option 2: via computer
See instructions [here](https://github.com/TransitNow/flashpay-wearos/blob/main/docs/how-to-sideload-apks-with-adb-on-computer.md)

## How to uninstall or re-assign the voice shortcut to another app?
- If you want to re-assign the native voice shortcut to another app, you will need to uninstall this app. There's no option to easily change the default app for the voice assistant shortcut (at least w/ TWP3).
- The "Digital assistant app" setting does not work regardless of what you set it to.
- Uninstall directly on Wear OS watch Settings -> Apps -> Voice Assistant Launcher -> Uninstall or run `adb uninstall com.jsyntax.customvoicelauncher`

## Beta Feedback
We welcome feedback on the beta version to improve the app. Please reach out with your comments and suggestions. 

Find my email on my [YouTube channel - https://www.youtube.com/@JSyntax](https://www.youtube.com/@JSyntax)  

## Support me by checking out my other apps
- [Cycle Now, a bike share app](https://cyclenowapp.com/) 
- [Transit Now, a TTC, MBTA, AC Transit bus predictions app](https://transitnowapp.com/)


