# Modifications vs upstream ShizuTools v1.4.6 (legendsayantan/ShizuTools, GPLv3)

1. Full Arabic localization: new `app/src/main/res/values-ar/strings.xml` translating every string; app name in Arabic launcher is "شيزو تولز". Tool brand names (Debloater, SoundMaster, etc.) kept in Latin script.
2. All previously hardcoded English UI strings (Toasts, dialogs, hints, notifications, debug screen, audio output names, severity labels) moved to string resources and translated to Arabic.
3. Accessibility: contentDescription added to all icon-only buttons (logs, filter, restore, play/stop, switch output, expand, EQ/balance resets); decorative icons (arrows, app icons, state dots, add icon) marked not important for accessibility. Play/stop and expand buttons update their labels dynamically.
4. Removed the GitHub/developer link button from the main screen.
5. Removed the upstream update checker (GradleUpdate) and its notifications.
6. Version set to 1.4.6-ar1 (versionCode 2). Same package name: uninstall the original English ShizuTools before installing this one.
7. New GitHub Actions workflow (workflow_dispatch only) building an unsigned release APK and a source ZIP into a GitHub Release.

No functional changes to any tool. Original LICENSE (GPLv3) applies; source of this modified version is published in this repository as required.

8. (ar2) SoundMaster control UI: auto-hide-after-timeout now defaults to OFF (was ON, 3s, touch-only timer) so TalkBack users can navigate without the dialog closing under them. The setting remains available.
