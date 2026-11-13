# Modifications vs upstream ShizuTools v1.4.6 (legendsayantan/ShizuTools, GPLv3)

1. Full Arabic localization: new `app/src/main/res/values-ar/strings.xml` translating every string; app name in Arabic launcher is "شيزو تولز". Tool brand names (Debloater, SoundMaster, etc.) kept in Latin script.
2. All previously hardcoded English UI strings (Toasts, dialogs, hints, notifications, debug screen, audio output names, severity labels) moved to string resources and translated to Arabic.
3. Accessibility: contentDescription added to all icon-only buttons (logs, filter, restore, play/stop, switch output, expand, EQ/balance resets); decorative icons (arrows, app icons, state dots, add icon) marked not important for accessibility. Play/stop and expand buttons update their labels dynamically.
4. Removed the GitHub/developer link button from the main screen.
5. Removed the upstream update checker (GradleUpdate) and its notifications.
6. Version set to 1.4.6-ar1 (versionCode 2). Same package name: uninstall the original English ShizuTools before installing this one.
7. New GitHub Actions workflow (workflow_dispatch only) building an unsigned release APK and a source ZIP into a GitHub Release.

No functional changes to any tool. Original LICENSE (GPLv3) applies; source of this modified version is published in this repository as required.

8. (ar2, REVERTED in ar3 per user decision) SoundMaster auto-hide default was briefly changed to OFF; ar3 restores upstream behavior. The user turns the switch off himself.

9. (ar2) Launcher app name stays "ShizuTools" (English) per user request; rule for all future mods: app names stay in English, app content in Arabic.

10. (ar3, standing rule for all future mods, per user) Only modify genuine modification targets: removing useless features, Arabic translation, accessibility labels. NEVER change the default of anything that has its own on/off switch in settings - the user toggles those himself. All future versions build on ar3 only.
