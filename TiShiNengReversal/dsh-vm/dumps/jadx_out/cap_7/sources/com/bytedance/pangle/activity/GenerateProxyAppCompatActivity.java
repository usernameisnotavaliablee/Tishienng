package com.bytedance.pangle.activity;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class GenerateProxyAppCompatActivity extends androidx.appcompat.app.AppCompatActivity implements com.bytedance.pangle.activity.xt {
    public com.bytedance.pangle.plugin.Plugin mPlugin;
    public com.bytedance.pangle.activity.GeneratePluginAppCompatActivity mTargetActivity;

    public GenerateProxyAppCompatActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.addContentView(r2, r3)
            return
        L8:
            super.addContentView(r2, r3)
            return
    }

    public void attachBaseContext(android.content.Context r1) {
            r0 = this;
            com.bytedance.pangle.activity.cw.j(r0, r1)
            return
    }

    public void closeContextMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.closeContextMenu()
            return
        L8:
            super/*android.app.Activity*/.closeContextMenu()
            return
    }

    public void closeOptionsMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.closeOptionsMenu()
            return
        L8:
            super.closeOptionsMenu()
            return
    }

    public android.app.PendingIntent createPendingResult(int r2, android.content.Intent r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.app.PendingIntent r2 = r0.createPendingResult(r2, r3, r4)
            return r2
        L9:
            android.app.PendingIntent r2 = super/*android.app.Activity*/.createPendingResult(r2, r3, r4)
            return r2
    }

    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.dispatchGenericMotionEvent(r2)
            return r2
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.dispatchKeyEvent(r2)
            return r2
        L9:
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }

    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)
            return r2
        L9:
            boolean r2 = super/*androidx.core.app.ComponentActivity*/.dispatchKeyShortcutEvent(r2)
            return r2
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.dispatchTouchEvent(r2)
            return r2
    }

    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.dispatchTrackballEvent(r2)
            return r2
    }

    public void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.dump(r2, r3, r4, r5)
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.dump(r2, r3, r4, r5)
            return
    }

    public void enterPictureInPictureMode() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.enterPictureInPictureMode()
            return
        L8:
            super/*android.app.Activity*/.enterPictureInPictureMode()
            return
    }

    public boolean enterPictureInPictureMode(android.app.PictureInPictureParams r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.enterPictureInPictureMode(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.enterPictureInPictureMode(r2)
            return r2
    }

    public android.view.View findViewById(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.View r2 = r0.findViewById(r2)
            return r2
        L9:
            android.view.View r2 = super.findViewById(r2)
            return r2
    }

    @Override // com.bytedance.pangle.activity.xt
    public void finish() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.finish()
            return
        L8:
            super/*android.app.Activity*/.finish()
            return
    }

    public void finishActivity(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.finishActivity(r2)
            return
        L8:
            super/*android.app.Activity*/.finishActivity(r2)
            return
    }

    public void finishActivityFromChild(android.app.Activity r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.finishActivityFromChild(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.finishActivityFromChild(r2, r3)
            return
    }

    public void finishAffinity() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.finishAffinity()
            return
        L8:
            super/*android.app.Activity*/.finishAffinity()
            return
    }

    public void finishAfterTransition() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.finishAfterTransition()
            return
        L8:
            super/*android.app.Activity*/.finishAfterTransition()
            return
    }

    public void finishAndRemoveTask() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.finishAndRemoveTask()
            return
        L8:
            super/*android.app.Activity*/.finishAndRemoveTask()
            return
    }

    public void finishFromChild(android.app.Activity r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.finishFromChild(r2)
            return
        L8:
            super/*android.app.Activity*/.finishFromChild(r2)
            return
    }

    public android.app.ActionBar getActionBar() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.app.ActionBar r0 = r0.getActionBar()
            return r0
        L9:
            android.app.ActionBar r0 = super/*android.app.Activity*/.getActionBar()
            return r0
    }

    public android.content.ComponentName getCallingActivity() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.content.ComponentName r0 = r0.getCallingActivity()
            return r0
        L9:
            android.content.ComponentName r0 = super/*android.app.Activity*/.getCallingActivity()
            return r0
    }

    public java.lang.String getCallingPackage() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getCallingPackage()
            return r0
        L9:
            java.lang.String r0 = super/*android.app.Activity*/.getCallingPackage()
            return r0
    }

    public int getChangingConfigurations() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super/*android.app.Activity*/.getChangingConfigurations()
            return r0
    }

    public android.content.ComponentName getComponentName() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.content.ComponentName r0 = r0.getComponentName()
            return r0
        L9:
            android.content.ComponentName r0 = super/*android.app.Activity*/.getComponentName()
            return r0
    }

    public android.transition.Scene getContentScene() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.transition.Scene r0 = r0.getContentScene()
            return r0
        L9:
            android.transition.Scene r0 = super/*android.app.Activity*/.getContentScene()
            return r0
    }

    public android.transition.TransitionManager getContentTransitionManager() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.transition.TransitionManager r0 = r0.getContentTransitionManager()
            return r0
        L9:
            android.transition.TransitionManager r0 = super/*android.app.Activity*/.getContentTransitionManager()
            return r0
    }

    public android.view.View getCurrentFocus() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.View r0 = r0.getCurrentFocus()
            return r0
        L9:
            android.view.View r0 = super/*android.app.Activity*/.getCurrentFocus()
            return r0
    }

    public android.app.FragmentManager getFragmentManager() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.app.FragmentManager r0 = r0.getFragmentManager()
            return r0
        L9:
            android.app.FragmentManager r0 = super/*android.app.Activity*/.getFragmentManager()
            return r0
    }

    @Override // com.bytedance.pangle.activity.xt
    public android.content.Intent getIntent() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.content.Intent r0 = r0.getIntent()
            return r0
        L9:
            android.content.Intent r0 = super/*android.app.Activity*/.getIntent()
            return r0
    }

    public java.lang.Object getLastNonConfigurationInstance() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.getLastNonConfigurationInstance()
            return r0
        L9:
            java.lang.Object r0 = super/*android.app.Activity*/.getLastNonConfigurationInstance()
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            return r0
        L9:
            android.view.LayoutInflater r0 = super/*android.app.Activity*/.getLayoutInflater()
            return r0
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            return r0
        L9:
            androidx.lifecycle.Lifecycle r0 = super/*androidx.activity.ComponentActivity*/.getLifecycle()
            return r0
    }

    public android.app.LoaderManager getLoaderManager() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.app.LoaderManager r0 = r0.getLoaderManager()
            return r0
        L9:
            android.app.LoaderManager r0 = super/*android.app.Activity*/.getLoaderManager()
            return r0
    }

    public java.lang.String getLocalClassName() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getLocalClassName()
            return r0
        L9:
            java.lang.String r0 = super/*android.app.Activity*/.getLocalClassName()
            return r0
    }

    public int getMaxNumPictureInPictureActions() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            int r0 = r0.getMaxNumPictureInPictureActions()
            return r0
        L9:
            int r0 = super/*android.app.Activity*/.getMaxNumPictureInPictureActions()
            return r0
    }

    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.MenuInflater r0 = r0.getMenuInflater()
            return r0
        L9:
            android.view.MenuInflater r0 = super.getMenuInflater()
            return r0
    }

    public android.content.Intent getParentActivityIntent() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.content.Intent r0 = r0.getParentActivityIntent()
            return r0
        L9:
            android.content.Intent r0 = super/*android.app.Activity*/.getParentActivityIntent()
            return r0
    }

    @Override // com.bytedance.pangle.activity.xt
    public com.bytedance.pangle.plugin.Plugin getPlugin() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            return r0
    }

    @Override // com.bytedance.pangle.activity.xt
    public abstract java.lang.String getPluginPkgName();

    public android.content.SharedPreferences getPreferences(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.content.SharedPreferences r2 = r0.getPreferences(r2)
            return r2
        L9:
            android.content.SharedPreferences r2 = super/*android.app.Activity*/.getPreferences(r2)
            return r2
    }

    public android.net.Uri getReferrer() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.net.Uri r0 = r0.getReferrer()
            return r0
        L9:
            android.net.Uri r0 = super/*android.app.Activity*/.getReferrer()
            return r0
    }

    public int getRequestedOrientation() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            int r0 = r0.getRequestedOrientation()
            return r0
        L9:
            int r0 = super/*android.app.Activity*/.getRequestedOrientation()
            return r0
    }

    public androidx.appcompat.app.ActionBar getSupportActionBar() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            return r0
        L9:
            androidx.appcompat.app.ActionBar r0 = super.getSupportActionBar()
            return r0
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            return r0
        L9:
            androidx.fragment.app.FragmentManager r0 = super/*androidx.fragment.app.FragmentActivity*/.getSupportFragmentManager()
            return r0
    }

    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
        L9:
            java.lang.Object r2 = super/*android.app.Activity*/.getSystemService(r2)
            return r2
    }

    public int getTaskId() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            int r0 = r0.getTaskId()
            return r0
        L9:
            int r0 = super/*android.app.Activity*/.getTaskId()
            return r0
    }

    public android.app.VoiceInteractor getVoiceInteractor() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.app.VoiceInteractor r0 = r0.getVoiceInteractor()
            return r0
        L9:
            android.app.VoiceInteractor r0 = super/*android.app.Activity*/.getVoiceInteractor()
            return r0
    }

    public android.view.Window getWindow() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.Window r0 = r0.getWindow()
            return r0
        L9:
            android.view.Window r0 = super/*android.app.Activity*/.getWindow()
            return r0
    }

    public android.view.WindowManager getWindowManager() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.WindowManager r0 = r0.getWindowManager()
            return r0
        L9:
            android.view.WindowManager r0 = super/*android.app.Activity*/.getWindowManager()
            return r0
    }

    public boolean hasWindowFocus() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.hasWindowFocus()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.hasWindowFocus()
            return r0
    }

    public void invalidateOptionsMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.invalidateOptionsMenu()
            return
        L8:
            super.invalidateOptionsMenu()
            return
    }

    public boolean isActivityTransitionRunning() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isActivityTransitionRunning()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isActivityTransitionRunning()
            return r0
    }

    public boolean isChangingConfigurations() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isChangingConfigurations()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isChangingConfigurations()
            return r0
    }

    public boolean isDestroyed() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isDestroyed()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isDestroyed()
            return r0
    }

    public boolean isFinishing() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isFinishing()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isFinishing()
            return r0
    }

    public boolean isImmersive() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isImmersive()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isImmersive()
            return r0
    }

    public boolean isInMultiWindowMode() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isInMultiWindowMode()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isInMultiWindowMode()
            return r0
    }

    public boolean isInPictureInPictureMode() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isInPictureInPictureMode()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isInPictureInPictureMode()
            return r0
    }

    public boolean isLocalVoiceInteractionSupported() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isLocalVoiceInteractionSupported()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isLocalVoiceInteractionSupported()
            return r0
    }

    public boolean isTaskRoot() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isTaskRoot()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isTaskRoot()
            return r0
    }

    public boolean isVoiceInteraction() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isVoiceInteraction()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isVoiceInteraction()
            return r0
    }

    public boolean isVoiceInteractionRoot() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.isVoiceInteractionRoot()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.isVoiceInteractionRoot()
            return r0
    }

    public boolean moveTaskToBack(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.moveTaskToBack(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.moveTaskToBack(r2)
            return r2
    }

    public boolean navigateUpTo(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.navigateUpTo(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.navigateUpTo(r2)
            return r2
    }

    public boolean navigateUpToFromChild(android.app.Activity r2, android.content.Intent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.navigateUpToFromChild(r2, r3)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.navigateUpToFromChild(r2, r3)
            return r2
    }

    public void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onActionModeFinished(r2)
            return
        L8:
            super/*android.app.Activity*/.onActionModeFinished(r2)
            return
    }

    public void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onActionModeStarted(r2)
            return
        L8:
            super/*android.app.Activity*/.onActionModeStarted(r2)
            return
    }

    public void onActivityReenter(int r2, android.content.Intent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onActivityReenter(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.onActivityReenter(r2, r3)
            return
    }

    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onActivityResult(r2, r3, r4)
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r2, r3, r4)
            return
    }

    protected void onApplyThemeResource(android.content.res.Resources.Theme r2, int r3, boolean r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onApplyThemeResource(r2, r3, r4)
            return
        L8:
            super/*android.app.Activity*/.onApplyThemeResource(r2, r3, r4)
            return
    }

    public void onAttachFragment(android.app.Fragment r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onAttachFragment(r2)
            return
        L8:
            super/*android.app.Activity*/.onAttachFragment(r2)
            return
    }

    public void onAttachedToWindow() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onAttachedToWindow()
            return
        L8:
            super/*android.app.Activity*/.onAttachedToWindow()
            return
    }

    public void onBackPressed() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onBackPressed()
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    protected void onChildTitleChanged(android.app.Activity r2, java.lang.CharSequence r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onChildTitleChanged(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.onChildTitleChanged(r2, r3)
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onConfigurationChanged(r2)
            return
        L8:
            super.onConfigurationChanged(r2)
            return
    }

    public void onContentChanged() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onContentChanged()
            return
        L8:
            super.onContentChanged()
            return
    }

    public boolean onContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onContextItemSelected(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onContextItemSelected(r2)
            return r2
    }

    public void onContextMenuClosed(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onContextMenuClosed(r2)
            return
        L8:
            super/*android.app.Activity*/.onContextMenuClosed(r2)
            return
    }

    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            com.bytedance.pangle.activity.cw.j(r0, r1)
            return
    }

    public void onCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onCreate(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.onCreate(r2, r3)
            return
    }

    public void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onCreateContextMenu(r2, r3, r4)
            return
        L8:
            super/*android.app.Activity*/.onCreateContextMenu(r2, r3, r4)
            return
    }

    public java.lang.CharSequence onCreateDescription() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.onCreateDescription()
            return r0
        L9:
            java.lang.CharSequence r0 = super/*android.app.Activity*/.onCreateDescription()
            return r0
    }

    protected android.app.Dialog onCreateDialog(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.app.Dialog r2 = r0.onCreateDialog(r2)
            return r2
        L9:
            android.app.Dialog r2 = super/*android.app.Activity*/.onCreateDialog(r2)
            return r2
    }

    protected android.app.Dialog onCreateDialog(int r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.app.Dialog r2 = r0.onCreateDialog(r2, r3)
            return r2
        L9:
            android.app.Dialog r2 = super/*android.app.Activity*/.onCreateDialog(r2, r3)
            return r2
    }

    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onCreateNavigateUpTaskStack(r2)
            return
        L8:
            super/*android.app.Activity*/.onCreateNavigateUpTaskStack(r2)
            return
    }

    public boolean onCreateOptionsMenu(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onCreateOptionsMenu(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onCreateOptionsMenu(r2)
            return r2
    }

    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
        L9:
            boolean r2 = super/*androidx.fragment.app.FragmentActivity*/.onCreatePanelMenu(r2, r3)
            return r2
    }

    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
        L9:
            android.view.View r2 = super/*android.app.Activity*/.onCreatePanelView(r2)
            return r2
    }

    public boolean onCreateThumbnail(android.graphics.Bitmap r2, android.graphics.Canvas r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onCreateThumbnail(r2, r3)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onCreateThumbnail(r2, r3)
            return r2
    }

    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
            return r2
        L9:
            android.view.View r2 = super/*androidx.fragment.app.FragmentActivity*/.onCreateView(r2, r3, r4, r5)
            return r2
    }

    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.View r2 = r0.onCreateView(r2, r3, r4)
            return r2
        L9:
            android.view.View r2 = super/*androidx.fragment.app.FragmentActivity*/.onCreateView(r2, r3, r4)
            return r2
    }

    protected void onDestroy() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onDestroy()
            return
        L8:
            super.onDestroy()
            return
    }

    public void onDetachedFromWindow() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onDetachedFromWindow()
            return
        L8:
            super/*android.app.Activity*/.onDetachedFromWindow()
            return
    }

    public void onEnterAnimationComplete() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onEnterAnimationComplete()
            return
        L8:
            super/*android.app.Activity*/.onEnterAnimationComplete()
            return
    }

    public boolean onGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onGenericMotionEvent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onGenericMotionEvent(r2)
            return r2
    }

    public void onGetDirectActions(android.os.CancellationSignal r2, java.util.function.Consumer r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onGetDirectActions(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.onGetDirectActions(r2, r3)
            return
    }

    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onKeyDown(r2, r3)
            return r2
        L9:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    public boolean onKeyLongPress(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onKeyLongPress(r2, r3)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onKeyLongPress(r2, r3)
            return r2
    }

    public boolean onKeyMultiple(int r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onKeyMultiple(r2, r3, r4)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onKeyMultiple(r2, r3, r4)
            return r2
    }

    public boolean onKeyShortcut(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onKeyShortcut(r2, r3)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onKeyShortcut(r2, r3)
            return r2
    }

    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onKeyUp(r2, r3)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onKeyUp(r2, r3)
            return r2
    }

    public void onLocalVoiceInteractionStarted() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onLocalVoiceInteractionStarted()
            return
        L8:
            super/*android.app.Activity*/.onLocalVoiceInteractionStarted()
            return
    }

    public void onLocalVoiceInteractionStopped() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onLocalVoiceInteractionStopped()
            return
        L8:
            super/*android.app.Activity*/.onLocalVoiceInteractionStopped()
            return
    }

    public void onLowMemory() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onLowMemory()
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onLowMemory()
            return
    }

    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
        L9:
            boolean r2 = super.onMenuOpened(r2, r3)
            return r2
    }

    public void onMultiWindowModeChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onMultiWindowModeChanged(r2)
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onMultiWindowModeChanged(r2)
            return
    }

    public void onMultiWindowModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onMultiWindowModeChanged(r2, r3)
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.onMultiWindowModeChanged(r2, r3)
            return
    }

    public boolean onNavigateUp() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.onNavigateUp()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.onNavigateUp()
            return r0
    }

    public boolean onNavigateUpFromChild(android.app.Activity r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onNavigateUpFromChild(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onNavigateUpFromChild(r2)
            return r2
    }

    protected void onNewIntent(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onNewIntent(r2)
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onNewIntent(r2)
            return
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onOptionsItemSelected(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onOptionsItemSelected(r2)
            return r2
    }

    public void onOptionsMenuClosed(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onOptionsMenuClosed(r2)
            return
        L8:
            super/*android.app.Activity*/.onOptionsMenuClosed(r2)
            return
    }

    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPanelClosed(r2, r3)
            return
        L8:
            super.onPanelClosed(r2, r3)
            return
    }

    protected void onPause() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPause()
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            return
    }

    public void onPerformDirectAction(java.lang.String r2, android.os.Bundle r3, android.os.CancellationSignal r4, java.util.function.Consumer r5) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPerformDirectAction(r2, r3, r4, r5)
            return
        L8:
            super/*android.app.Activity*/.onPerformDirectAction(r2, r3, r4, r5)
            return
    }

    public void onPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPictureInPictureModeChanged(r2)
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onPictureInPictureModeChanged(r2)
            return
    }

    public void onPictureInPictureModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPictureInPictureModeChanged(r2, r3)
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.onPictureInPictureModeChanged(r2, r3)
            return
    }

    public boolean onPictureInPictureRequested() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.onPictureInPictureRequested()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.onPictureInPictureRequested()
            return r0
    }

    protected void onPostCreate(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPostCreate(r2)
            return
        L8:
            super.onPostCreate(r2)
            return
    }

    public void onPostCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPostCreate(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.onPostCreate(r2, r3)
            return
    }

    protected void onPostResume() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPostResume()
            return
        L8:
            super.onPostResume()
            return
    }

    protected void onPrepareDialog(int r2, android.app.Dialog r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPrepareDialog(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.onPrepareDialog(r2, r3)
            return
    }

    protected void onPrepareDialog(int r2, android.app.Dialog r3, android.os.Bundle r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPrepareDialog(r2, r3, r4)
            return
        L8:
            super/*android.app.Activity*/.onPrepareDialog(r2, r3, r4)
            return
    }

    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onPrepareNavigateUpTaskStack(r2)
            return
        L8:
            super/*android.app.Activity*/.onPrepareNavigateUpTaskStack(r2)
            return
    }

    public boolean onPrepareOptionsMenu(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onPrepareOptionsMenu(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onPrepareOptionsMenu(r2)
            return r2
    }

    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
        L9:
            boolean r2 = super/*androidx.fragment.app.FragmentActivity*/.onPreparePanel(r2, r3, r4)
            return r2
    }

    public void onProvideAssistContent(android.app.assist.AssistContent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onProvideAssistContent(r2)
            return
        L8:
            super/*android.app.Activity*/.onProvideAssistContent(r2)
            return
    }

    public void onProvideAssistData(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onProvideAssistData(r2)
            return
        L8:
            super/*android.app.Activity*/.onProvideAssistData(r2)
            return
    }

    public void onProvideKeyboardShortcuts(java.util.List r2, android.view.Menu r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onProvideKeyboardShortcuts(r2, r3, r4)
            return
        L8:
            super/*android.app.Activity*/.onProvideKeyboardShortcuts(r2, r3, r4)
            return
    }

    public android.net.Uri onProvideReferrer() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.net.Uri r0 = r0.onProvideReferrer()
            return r0
        L9:
            android.net.Uri r0 = super/*android.app.Activity*/.onProvideReferrer()
            return r0
    }

    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.stub.StubApp.interface22(r2, r3, r4)
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto Lb
            r0.onRequestPermissionsResult(r2, r3, r4)
            return
        Lb:
            super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    protected void onRestart() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onRestart()
            return
        L8:
            super/*android.app.Activity*/.onRestart()
            return
    }

    protected void onRestoreInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onRestoreInstanceState(r2)
            return
        L8:
            super/*android.app.Activity*/.onRestoreInstanceState(r2)
            return
    }

    public void onRestoreInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onRestoreInstanceState(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.onRestoreInstanceState(r2, r3)
            return
    }

    protected void onResume() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onResume()
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            return
    }

    protected void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onSaveInstanceState(r2)
            goto Lb
        L8:
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r2)
        Lb:
            r2.clear()
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onSaveInstanceState(r2, r3)
            goto Lb
        L8:
            super/*android.app.Activity*/.onSaveInstanceState(r2, r3)
        Lb:
            r2.clear()
            return
    }

    public boolean onSearchRequested() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.onSearchRequested()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.onSearchRequested()
            return r0
    }

    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onSearchRequested(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onSearchRequested(r2)
            return r2
    }

    protected void onStart() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onStart()
            return
        L8:
            super.onStart()
            return
    }

    public void onStateNotSaved() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onStateNotSaved()
            return
        L8:
            super/*androidx.fragment.app.FragmentActivity*/.onStateNotSaved()
            return
    }

    protected void onStop() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onStop()
            return
        L8:
            super.onStop()
            return
    }

    protected void onTitleChanged(java.lang.CharSequence r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onTitleChanged(r2, r3)
            return
        L8:
            super.onTitleChanged(r2, r3)
            return
    }

    public void onTopResumedActivityChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onTopResumedActivityChanged(r2)
            return
        L8:
            super/*android.app.Activity*/.onTopResumedActivityChanged(r2)
            return
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onTouchEvent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onTouchEvent(r2)
            return r2
    }

    public boolean onTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.onTrackballEvent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.onTrackballEvent(r2)
            return r2
    }

    public void onTrimMemory(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onTrimMemory(r2)
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.onTrimMemory(r2)
            return
    }

    public void onUserInteraction() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onUserInteraction()
            return
        L8:
            super/*android.app.Activity*/.onUserInteraction()
            return
    }

    protected void onUserLeaveHint() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onUserLeaveHint()
            return
        L8:
            super/*android.app.Activity*/.onUserLeaveHint()
            return
    }

    public void onVisibleBehindCanceled() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onVisibleBehindCanceled()
            return
        L8:
            super/*android.app.Activity*/.onVisibleBehindCanceled()
            return
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onWindowAttributesChanged(r2)
            return
        L8:
            super/*android.app.Activity*/.onWindowAttributesChanged(r2)
            return
    }

    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.onWindowFocusChanged(r2)
            return
        L8:
            super/*android.app.Activity*/.onWindowFocusChanged(r2)
            return
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2)
            return r2
        L9:
            android.view.ActionMode r2 = super/*android.app.Activity*/.onWindowStartingActionMode(r2)
            return r2
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2, r3)
            return r2
        L9:
            android.view.ActionMode r2 = super/*android.app.Activity*/.onWindowStartingActionMode(r2, r3)
            return r2
    }

    public void openContextMenu(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.openContextMenu(r2)
            return
        L8:
            super/*android.app.Activity*/.openContextMenu(r2)
            return
    }

    public void openOptionsMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.openOptionsMenu()
            return
        L8:
            super.openOptionsMenu()
            return
    }

    public void overridePendingTransition(int r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.overridePendingTransition(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.overridePendingTransition(r2, r3)
            return
    }

    public void postponeEnterTransition() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.postponeEnterTransition()
            return
        L8:
            super/*android.app.Activity*/.postponeEnterTransition()
            return
    }

    public void recreate() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.recreate()
            return
        L8:
            super/*android.app.Activity*/.recreate()
            return
    }

    public void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.registerActivityLifecycleCallbacks(r2)
            return
        L8:
            super/*android.app.Activity*/.registerActivityLifecycleCallbacks(r2)
            return
    }

    public void registerForContextMenu(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.registerForContextMenu(r2)
            return
        L8:
            super/*android.app.Activity*/.registerForContextMenu(r2)
            return
    }

    public boolean releaseInstance() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r0 = r0.releaseInstance()
            return r0
        L9:
            boolean r0 = super/*android.app.Activity*/.releaseInstance()
            return r0
    }

    public void reportFullyDrawn() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.reportFullyDrawn()
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.reportFullyDrawn()
            return
    }

    public android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.DragAndDropPermissions r2 = r0.requestDragAndDropPermissions(r2)
            return r2
        L9:
            android.view.DragAndDropPermissions r2 = super/*android.app.Activity*/.requestDragAndDropPermissions(r2)
            return r2
    }

    public boolean requestVisibleBehind(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.requestVisibleBehind(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.requestVisibleBehind(r2)
            return r2
    }

    public void setActionBar(android.widget.Toolbar r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setActionBar(r2)
            return
        L8:
            super/*android.app.Activity*/.setActionBar(r2)
            return
    }

    public void setContentTransitionManager(android.transition.TransitionManager r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setContentTransitionManager(r2)
            return
        L8:
            super/*android.app.Activity*/.setContentTransitionManager(r2)
            return
    }

    public void setContentView(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setContentView(r2)
            return
        L8:
            super.setContentView(r2)
            return
    }

    public void setContentView(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setContentView(r2)
            return
        L8:
            super.setContentView(r2)
            return
    }

    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setContentView(r2, r3)
            return
        L8:
            super.setContentView(r2, r3)
            return
    }

    public void setEnterSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setEnterSharedElementCallback(r2)
            return
        L8:
            super/*android.app.Activity*/.setEnterSharedElementCallback(r2)
            return
    }

    public void setExitSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setExitSharedElementCallback(r2)
            return
        L8:
            super/*android.app.Activity*/.setExitSharedElementCallback(r2)
            return
    }

    public void setFinishOnTouchOutside(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setFinishOnTouchOutside(r2)
            return
        L8:
            super/*android.app.Activity*/.setFinishOnTouchOutside(r2)
            return
    }

    public void setImmersive(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setImmersive(r2)
            return
        L8:
            super/*android.app.Activity*/.setImmersive(r2)
            return
    }

    public void setInheritShowWhenLocked(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setInheritShowWhenLocked(r2)
            return
        L8:
            super/*android.app.Activity*/.setInheritShowWhenLocked(r2)
            return
    }

    public void setIntent(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setIntent(r2)
            return
        L8:
            super/*android.app.Activity*/.setIntent(r2)
            return
    }

    public void setLocusContext(android.content.LocusId r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setLocusContext(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.setLocusContext(r2, r3)
            return
    }

    public void setPictureInPictureParams(android.app.PictureInPictureParams r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setPictureInPictureParams(r2)
            return
        L8:
            super/*android.app.Activity*/.setPictureInPictureParams(r2)
            return
    }

    @Override // com.bytedance.pangle.activity.xt
    public void setPlugin(com.bytedance.pangle.plugin.Plugin r1) {
            r0 = this;
            r0.mPlugin = r1
            return
    }

    public void setRequestedOrientation(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setRequestedOrientation(r2)
            return
        L8:
            super/*android.app.Activity*/.setRequestedOrientation(r2)
            return
    }

    public void setShowWhenLocked(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setShowWhenLocked(r2)
            return
        L8:
            super/*android.app.Activity*/.setShowWhenLocked(r2)
            return
    }

    @Override // com.bytedance.pangle.activity.xt
    public void setTargetActivity(com.bytedance.pangle.activity.IPluginActivity r1) {
            r0 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r1 = (com.bytedance.pangle.activity.GeneratePluginAppCompatActivity) r1
            r0.mTargetActivity = r1
            return
    }

    public void setTaskDescription(android.app.ActivityManager.TaskDescription r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setTaskDescription(r2)
            return
        L8:
            super/*android.app.Activity*/.setTaskDescription(r2)
            return
    }

    public void setTheme(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setTheme(r2)
            return
        L8:
            super.setTheme(r2)
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setTitle(r2)
            return
        L8:
            super/*android.app.Activity*/.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setTitle(r2)
            return
        L8:
            super/*android.app.Activity*/.setTitle(r2)
            return
    }

    public void setTitleColor(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setTitleColor(r2)
            return
        L8:
            super/*android.app.Activity*/.setTitleColor(r2)
            return
    }

    public boolean setTranslucent(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.setTranslucent(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.setTranslucent(r2)
            return r2
    }

    public void setTurnScreenOn(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setTurnScreenOn(r2)
            return
        L8:
            super/*android.app.Activity*/.setTurnScreenOn(r2)
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setVisible(r2)
            return
        L8:
            super/*android.app.Activity*/.setVisible(r2)
            return
    }

    public void setVrModeEnabled(boolean r2, android.content.ComponentName r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.setVrModeEnabled(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.setVrModeEnabled(r2, r3)
            return
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.shouldShowRequestPermissionRationale(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.shouldShowRequestPermissionRationale(r2)
            return r2
    }

    public boolean shouldUpRecreateTask(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.shouldUpRecreateTask(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.shouldUpRecreateTask(r2)
            return r2
    }

    public boolean showAssist(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.showAssist(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.showAssist(r2)
            return r2
    }

    public void showLockTaskEscapeMessage() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.showLockTaskEscapeMessage()
            return
        L8:
            super/*android.app.Activity*/.showLockTaskEscapeMessage()
            return
    }

    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.ActionMode r2 = r0.startActionMode(r2)
            return r2
        L9:
            android.view.ActionMode r2 = super/*android.app.Activity*/.startActionMode(r2)
            return r2
    }

    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            android.view.ActionMode r2 = r0.startActionMode(r2, r3)
            return r2
        L9:
            android.view.ActionMode r2 = super/*android.app.Activity*/.startActionMode(r2, r3)
            return r2
    }

    public void startActivities(android.content.Intent[] r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivities(r2)
            return
        L8:
            super/*android.app.Activity*/.startActivities(r2)
            return
    }

    public void startActivities(android.content.Intent[] r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivities(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.startActivities(r2, r3)
            return
    }

    public void startActivity(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivity(r2)
            return
        L8:
            super/*android.app.Activity*/.startActivity(r2)
            return
    }

    public void startActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivity(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.startActivity(r2, r3)
            return
    }

    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivityForResult(r2, r3)
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.startActivityForResult(r2, r3)
            return
    }

    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivityForResult(r2, r3, r4)
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.startActivityForResult(r2, r3, r4)
            return
    }

    public void startActivityForResult(java.lang.String r1, android.content.Intent r2, int r3, android.os.Bundle r4) {
            r0 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r1 = r0.mTargetActivity
            if (r1 == 0) goto L8
            r1.startActivityForResult(r2, r3, r4)
            return
        L8:
            super/*androidx.activity.ComponentActivity*/.startActivityForResult(r2, r3, r4)
            return
    }

    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivityFromChild(r2, r3, r4)
            return
        L8:
            super/*android.app.Activity*/.startActivityFromChild(r2, r3, r4)
            return
    }

    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivityFromChild(r2, r3, r4, r5)
            return
        L8:
            super/*android.app.Activity*/.startActivityFromChild(r2, r3, r4, r5)
            return
    }

    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivityFromFragment(r2, r3, r4)
            return
        L8:
            super/*android.app.Activity*/.startActivityFromFragment(r2, r3, r4)
            return
    }

    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startActivityFromFragment(r2, r3, r4, r5)
            return
        L8:
            super/*android.app.Activity*/.startActivityFromFragment(r2, r3, r4, r5)
            return
    }

    public boolean startActivityIfNeeded(android.content.Intent r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.startActivityIfNeeded(r2, r3)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.startActivityIfNeeded(r2, r3)
            return r2
    }

    public boolean startActivityIfNeeded(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.startActivityIfNeeded(r2, r3, r4)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.startActivityIfNeeded(r2, r3, r4)
            return r2
    }

    public void startIntentSender(android.content.IntentSender r7, android.content.Intent r8, int r9, int r10, int r11) throws android.content.IntentSender.SendIntentException {
            r6 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r6.mTargetActivity
            if (r0 == 0) goto Ld
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.startIntentSender(r1, r2, r3, r4, r5)
            return
        Ld:
            super/*android.app.Activity*/.startIntentSender(r7, r8, r9, r10, r11)
            return
    }

    public void startIntentSender(android.content.IntentSender r8, android.content.Intent r9, int r10, int r11, int r12, android.os.Bundle r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r7.mTargetActivity
            if (r0 == 0) goto Le
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.startIntentSender(r1, r2, r3, r4, r5, r6)
            return
        Le:
            super/*android.app.Activity*/.startIntentSender(r8, r9, r10, r11, r12, r13)
            return
    }

    public void startIntentSenderForResult(android.content.IntentSender r8, int r9, android.content.Intent r10, int r11, int r12, int r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r7.mTargetActivity
            if (r0 == 0) goto Le
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
        Le:
            super/*androidx.activity.ComponentActivity*/.startIntentSenderForResult(r8, r9, r10, r11, r12, r13)
            return
    }

    public void startIntentSenderForResult(android.content.IntentSender r9, int r10, android.content.Intent r11, int r12, int r13, int r14, android.os.Bundle r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r8.mTargetActivity
            if (r0 == 0) goto Lf
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
        Lf:
            super/*androidx.activity.ComponentActivity*/.startIntentSenderForResult(r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public void startIntentSenderFromChild(android.app.Activity r9, android.content.IntentSender r10, int r11, android.content.Intent r12, int r13, int r14, int r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r8.mTargetActivity
            if (r0 == 0) goto Lf
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.startIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7)
            return
        Lf:
            super/*android.app.Activity*/.startIntentSenderFromChild(r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public void startIntentSenderFromChild(android.app.Activity r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r9.mTargetActivity
            if (r0 == 0) goto L12
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.startIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L12:
            super/*android.app.Activity*/.startIntentSenderFromChild(r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    public void startLocalVoiceInteraction(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startLocalVoiceInteraction(r2)
            return
        L8:
            super/*android.app.Activity*/.startLocalVoiceInteraction(r2)
            return
    }

    public void startLockTask() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startLockTask()
            return
        L8:
            super/*android.app.Activity*/.startLockTask()
            return
    }

    public void startManagingCursor(android.database.Cursor r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startManagingCursor(r2)
            return
        L8:
            super/*android.app.Activity*/.startManagingCursor(r2)
            return
    }

    public boolean startNextMatchingActivity(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.startNextMatchingActivity(r2)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.startNextMatchingActivity(r2)
            return r2
    }

    public boolean startNextMatchingActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L9
            boolean r2 = r0.startNextMatchingActivity(r2, r3)
            return r2
        L9:
            boolean r2 = super/*android.app.Activity*/.startNextMatchingActivity(r2, r3)
            return r2
    }

    public void startPostponedEnterTransition() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startPostponedEnterTransition()
            return
        L8:
            super/*android.app.Activity*/.startPostponedEnterTransition()
            return
    }

    public void startSearch(java.lang.String r2, boolean r3, android.os.Bundle r4, boolean r5) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.startSearch(r2, r3, r4, r5)
            return
        L8:
            super/*android.app.Activity*/.startSearch(r2, r3, r4, r5)
            return
    }

    public void stopLocalVoiceInteraction() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.stopLocalVoiceInteraction()
            return
        L8:
            super/*android.app.Activity*/.stopLocalVoiceInteraction()
            return
    }

    public void stopLockTask() {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.stopLockTask()
            return
        L8:
            super/*android.app.Activity*/.stopLockTask()
            return
    }

    public void stopManagingCursor(android.database.Cursor r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.stopManagingCursor(r2)
            return
        L8:
            super/*android.app.Activity*/.stopManagingCursor(r2)
            return
    }

    public void takeKeyEvents(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.takeKeyEvents(r2)
            return
        L8:
            super/*android.app.Activity*/.takeKeyEvents(r2)
            return
    }

    public void triggerSearch(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.triggerSearch(r2, r3)
            return
        L8:
            super/*android.app.Activity*/.triggerSearch(r2, r3)
            return
    }

    public void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.unregisterActivityLifecycleCallbacks(r2)
            return
        L8:
            super/*android.app.Activity*/.unregisterActivityLifecycleCallbacks(r2)
            return
    }

    public void unregisterForContextMenu(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GeneratePluginAppCompatActivity r0 = r1.mTargetActivity
            if (r0 == 0) goto L8
            r0.unregisterForContextMenu(r2)
            return
        L8:
            super/*android.app.Activity*/.unregisterForContextMenu(r2)
            return
    }

    public void zeusSuperAddContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            super.addContentView(r1, r2)
            return
    }

    @Override // com.bytedance.pangle.activity.xt
    public void zeusSuperAttachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    public void zeusSuperCloseContextMenu() {
            r0 = this;
            super/*android.app.Activity*/.closeContextMenu()
            return
    }

    public void zeusSuperCloseOptionsMenu() {
            r0 = this;
            super.closeOptionsMenu()
            return
    }

    public boolean zeusSuperConvertToTranslucent(android.app.Activity.TranslucentConversionListener r8, android.app.ActivityOptions r9) {
            r7 = this;
            r0 = 0
            java.lang.String r1 = "android.app.Activity$TranslucentConversionListener"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L2d
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "convertToTranslucent"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L2d
            r5[r0] = r1     // Catch: java.lang.Exception -> L2d
            java.lang.Class<android.app.ActivityOptions> r1 = android.app.ActivityOptions.class
            r6 = 1
            r5[r6] = r1     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L2d
            r1.setAccessible(r6)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L2d
            r2[r0] = r8     // Catch: java.lang.Exception -> L2d
            r2[r6] = r9     // Catch: java.lang.Exception -> L2d
            java.lang.Object r8 = r1.invoke(r7, r2)     // Catch: java.lang.Exception -> L2d
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L2d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> L2d
            return r8
        L2d:
            r8 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r8)
            return r0
    }

    public android.app.PendingIntent zeusSuperCreatePendingResult(int r1, android.content.Intent r2, int r3) {
            r0 = this;
            android.app.PendingIntent r1 = super/*android.app.Activity*/.createPendingResult(r1, r2, r3)
            return r1
    }

    public boolean zeusSuperDispatchGenericMotionEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.dispatchGenericMotionEvent(r1)
            return r1
    }

    public boolean zeusSuperDispatchKeyEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    public boolean zeusSuperDispatchKeyShortcutEvent(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super/*androidx.core.app.ComponentActivity*/.dispatchKeyShortcutEvent(r1)
            return r1
    }

    public boolean zeusSuperDispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.dispatchPopulateAccessibilityEvent(r1)
            return r1
    }

    public boolean zeusSuperDispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.dispatchTouchEvent(r1)
            return r1
    }

    public boolean zeusSuperDispatchTrackballEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.dispatchTrackballEvent(r1)
            return r1
    }

    public void zeusSuperDump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.dump(r1, r2, r3, r4)
            return
    }

    public void zeusSuperEnterPictureInPictureMode() {
            r0 = this;
            super/*android.app.Activity*/.enterPictureInPictureMode()
            return
    }

    public boolean zeusSuperEnterPictureInPictureMode(android.app.PictureInPictureParams r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.enterPictureInPictureMode(r1)
            return r1
    }

    public android.view.View zeusSuperFindViewById(int r1) {
            r0 = this;
            android.view.View r1 = super.findViewById(r1)
            return r1
    }

    public void zeusSuperFinish() {
            r0 = this;
            super/*android.app.Activity*/.finish()
            return
    }

    public void zeusSuperFinishActivity(int r1) {
            r0 = this;
            super/*android.app.Activity*/.finishActivity(r1)
            return
    }

    public void zeusSuperFinishActivityFromChild(android.app.Activity r1, int r2) {
            r0 = this;
            super/*android.app.Activity*/.finishActivityFromChild(r1, r2)
            return
    }

    public void zeusSuperFinishAffinity() {
            r0 = this;
            super/*android.app.Activity*/.finishAffinity()
            return
    }

    public void zeusSuperFinishAfterTransition() {
            r0 = this;
            super/*android.app.Activity*/.finishAfterTransition()
            return
    }

    public void zeusSuperFinishAndRemoveTask() {
            r0 = this;
            super/*android.app.Activity*/.finishAndRemoveTask()
            return
    }

    public void zeusSuperFinishFromChild(android.app.Activity r1) {
            r0 = this;
            super/*android.app.Activity*/.finishFromChild(r1)
            return
    }

    public android.app.ActionBar zeusSuperGetActionBar() {
            r1 = this;
            android.app.ActionBar r0 = super/*android.app.Activity*/.getActionBar()
            return r0
    }

    public android.content.ComponentName zeusSuperGetCallingActivity() {
            r1 = this;
            android.content.ComponentName r0 = super/*android.app.Activity*/.getCallingActivity()
            return r0
    }

    public java.lang.String zeusSuperGetCallingPackage() {
            r1 = this;
            java.lang.String r0 = super/*android.app.Activity*/.getCallingPackage()
            return r0
    }

    public int zeusSuperGetChangingConfigurations() {
            r1 = this;
            int r0 = super/*android.app.Activity*/.getChangingConfigurations()
            return r0
    }

    public android.content.ComponentName zeusSuperGetComponentName() {
            r1 = this;
            android.content.ComponentName r0 = super/*android.app.Activity*/.getComponentName()
            return r0
    }

    public android.transition.Scene zeusSuperGetContentScene() {
            r1 = this;
            android.transition.Scene r0 = super/*android.app.Activity*/.getContentScene()
            return r0
    }

    public android.transition.TransitionManager zeusSuperGetContentTransitionManager() {
            r1 = this;
            android.transition.TransitionManager r0 = super/*android.app.Activity*/.getContentTransitionManager()
            return r0
    }

    public android.view.View zeusSuperGetCurrentFocus() {
            r1 = this;
            android.view.View r0 = super/*android.app.Activity*/.getCurrentFocus()
            return r0
    }

    public android.app.FragmentManager zeusSuperGetFragmentManager() {
            r1 = this;
            android.app.FragmentManager r0 = super/*android.app.Activity*/.getFragmentManager()
            return r0
    }

    public android.content.Intent zeusSuperGetIntent() {
            r1 = this;
            android.content.Intent r0 = super/*android.app.Activity*/.getIntent()
            return r0
    }

    public java.lang.Object zeusSuperGetLastNonConfigurationInstance() {
            r1 = this;
            java.lang.Object r0 = super/*android.app.Activity*/.getLastNonConfigurationInstance()
            return r0
    }

    public android.view.LayoutInflater zeusSuperGetLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = super/*android.app.Activity*/.getLayoutInflater()
            return r0
    }

    public androidx.lifecycle.Lifecycle zeusSuperGetLifecycle() {
            r1 = this;
            androidx.lifecycle.Lifecycle r0 = super/*androidx.activity.ComponentActivity*/.getLifecycle()
            return r0
    }

    public android.app.LoaderManager zeusSuperGetLoaderManager() {
            r1 = this;
            android.app.LoaderManager r0 = super/*android.app.Activity*/.getLoaderManager()
            return r0
    }

    public java.lang.String zeusSuperGetLocalClassName() {
            r1 = this;
            java.lang.String r0 = super/*android.app.Activity*/.getLocalClassName()
            return r0
    }

    public int zeusSuperGetMaxNumPictureInPictureActions() {
            r1 = this;
            int r0 = super/*android.app.Activity*/.getMaxNumPictureInPictureActions()
            return r0
    }

    public android.view.MenuInflater zeusSuperGetMenuInflater() {
            r1 = this;
            android.view.MenuInflater r0 = super.getMenuInflater()
            return r0
    }

    public android.content.Intent zeusSuperGetParentActivityIntent() {
            r1 = this;
            android.content.Intent r0 = super/*android.app.Activity*/.getParentActivityIntent()
            return r0
    }

    public android.content.SharedPreferences zeusSuperGetPreferences(int r1) {
            r0 = this;
            android.content.SharedPreferences r1 = super/*android.app.Activity*/.getPreferences(r1)
            return r1
    }

    public android.net.Uri zeusSuperGetReferrer() {
            r1 = this;
            android.net.Uri r0 = super/*android.app.Activity*/.getReferrer()
            return r0
    }

    public int zeusSuperGetRequestedOrientation() {
            r1 = this;
            int r0 = super/*android.app.Activity*/.getRequestedOrientation()
            return r0
    }

    public androidx.appcompat.app.ActionBar zeusSuperGetSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.ActionBar r0 = super.getSupportActionBar()
            return r0
    }

    public androidx.fragment.app.FragmentManager zeusSuperGetSupportFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = super/*androidx.fragment.app.FragmentActivity*/.getSupportFragmentManager()
            return r0
    }

    public java.lang.Object zeusSuperGetSystemService(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super/*android.app.Activity*/.getSystemService(r1)
            return r1
    }

    public int zeusSuperGetTaskId() {
            r1 = this;
            int r0 = super/*android.app.Activity*/.getTaskId()
            return r0
    }

    public android.app.VoiceInteractor zeusSuperGetVoiceInteractor() {
            r1 = this;
            android.app.VoiceInteractor r0 = super/*android.app.Activity*/.getVoiceInteractor()
            return r0
    }

    public android.view.Window zeusSuperGetWindow() {
            r1 = this;
            android.view.Window r0 = super/*android.app.Activity*/.getWindow()
            return r0
    }

    public android.view.WindowManager zeusSuperGetWindowManager() {
            r1 = this;
            android.view.WindowManager r0 = super/*android.app.Activity*/.getWindowManager()
            return r0
    }

    public boolean zeusSuperHasWindowFocus() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.hasWindowFocus()
            return r0
    }

    public void zeusSuperInvalidateOptionsMenu() {
            r0 = this;
            super.invalidateOptionsMenu()
            return
    }

    public boolean zeusSuperIsActivityTransitionRunning() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isActivityTransitionRunning()
            return r0
    }

    public boolean zeusSuperIsChangingConfigurations() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isChangingConfigurations()
            return r0
    }

    public boolean zeusSuperIsDestroyed() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isDestroyed()
            return r0
    }

    public boolean zeusSuperIsFinishing() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isFinishing()
            return r0
    }

    public boolean zeusSuperIsImmersive() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isImmersive()
            return r0
    }

    public boolean zeusSuperIsInMultiWindowMode() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isInMultiWindowMode()
            return r0
    }

    public boolean zeusSuperIsInPictureInPictureMode() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isInPictureInPictureMode()
            return r0
    }

    public boolean zeusSuperIsLocalVoiceInteractionSupported() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isLocalVoiceInteractionSupported()
            return r0
    }

    public boolean zeusSuperIsTaskRoot() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isTaskRoot()
            return r0
    }

    public boolean zeusSuperIsVoiceInteraction() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isVoiceInteraction()
            return r0
    }

    public boolean zeusSuperIsVoiceInteractionRoot() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.isVoiceInteractionRoot()
            return r0
    }

    public boolean zeusSuperMoveTaskToBack(boolean r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.moveTaskToBack(r1)
            return r1
    }

    public boolean zeusSuperNavigateUpTo(android.content.Intent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.navigateUpTo(r1)
            return r1
    }

    public boolean zeusSuperNavigateUpToFromChild(android.app.Activity r1, android.content.Intent r2) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.navigateUpToFromChild(r1, r2)
            return r1
    }

    public void zeusSuperOnActionModeFinished(android.view.ActionMode r1) {
            r0 = this;
            super/*android.app.Activity*/.onActionModeFinished(r1)
            return
    }

    public void zeusSuperOnActionModeStarted(android.view.ActionMode r1) {
            r0 = this;
            super/*android.app.Activity*/.onActionModeStarted(r1)
            return
    }

    public void zeusSuperOnActivityReenter(int r1, android.content.Intent r2) {
            r0 = this;
            super/*android.app.Activity*/.onActivityReenter(r1, r2)
            return
    }

    protected void zeusSuperOnActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(r1, r2, r3)
            return
    }

    protected void zeusSuperOnApplyThemeResource(android.content.res.Resources.Theme r1, int r2, boolean r3) {
            r0 = this;
            super/*android.app.Activity*/.onApplyThemeResource(r1, r2, r3)
            return
    }

    public void zeusSuperOnAttachFragment(android.app.Fragment r1) {
            r0 = this;
            super/*android.app.Activity*/.onAttachFragment(r1)
            return
    }

    public void zeusSuperOnAttachedToWindow() {
            r0 = this;
            super/*android.app.Activity*/.onAttachedToWindow()
            return
    }

    public void zeusSuperOnBackPressed() {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.onBackPressed()
            return
    }

    protected void zeusSuperOnChildTitleChanged(android.app.Activity r1, java.lang.CharSequence r2) {
            r0 = this;
            super/*android.app.Activity*/.onChildTitleChanged(r1, r2)
            return
    }

    public void zeusSuperOnConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            return
    }

    public void zeusSuperOnContentChanged() {
            r0 = this;
            super.onContentChanged()
            return
    }

    public boolean zeusSuperOnContextItemSelected(android.view.MenuItem r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onContextItemSelected(r1)
            return r1
    }

    public void zeusSuperOnContextMenuClosed(android.view.Menu r1) {
            r0 = this;
            super/*android.app.Activity*/.onContextMenuClosed(r1)
            return
    }

    @Override // com.bytedance.pangle.activity.xt
    public void zeusSuperOnCreate(android.os.Bundle r1) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(r1)
            return
    }

    public void zeusSuperOnCreate(android.os.Bundle r1, android.os.PersistableBundle r2) {
            r0 = this;
            super/*android.app.Activity*/.onCreate(r1, r2)
            return
    }

    public void zeusSuperOnCreateContextMenu(android.view.ContextMenu r1, android.view.View r2, android.view.ContextMenu.ContextMenuInfo r3) {
            r0 = this;
            super/*android.app.Activity*/.onCreateContextMenu(r1, r2, r3)
            return
    }

    public java.lang.CharSequence zeusSuperOnCreateDescription() {
            r1 = this;
            java.lang.CharSequence r0 = super/*android.app.Activity*/.onCreateDescription()
            return r0
    }

    protected android.app.Dialog zeusSuperOnCreateDialog(int r1) {
            r0 = this;
            android.app.Dialog r1 = super/*android.app.Activity*/.onCreateDialog(r1)
            return r1
    }

    protected android.app.Dialog zeusSuperOnCreateDialog(int r1, android.os.Bundle r2) {
            r0 = this;
            android.app.Dialog r1 = super/*android.app.Activity*/.onCreateDialog(r1, r2)
            return r1
    }

    public void zeusSuperOnCreateNavigateUpTaskStack(android.app.TaskStackBuilder r1) {
            r0 = this;
            super/*android.app.Activity*/.onCreateNavigateUpTaskStack(r1)
            return
    }

    public boolean zeusSuperOnCreateOptionsMenu(android.view.Menu r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onCreateOptionsMenu(r1)
            return r1
    }

    public boolean zeusSuperOnCreatePanelMenu(int r1, android.view.Menu r2) {
            r0 = this;
            boolean r1 = super/*androidx.fragment.app.FragmentActivity*/.onCreatePanelMenu(r1, r2)
            return r1
    }

    public android.view.View zeusSuperOnCreatePanelView(int r1) {
            r0 = this;
            android.view.View r1 = super/*android.app.Activity*/.onCreatePanelView(r1)
            return r1
    }

    public boolean zeusSuperOnCreateThumbnail(android.graphics.Bitmap r1, android.graphics.Canvas r2) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onCreateThumbnail(r1, r2)
            return r1
    }

    public android.view.View zeusSuperOnCreateView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r0 = this;
            android.view.View r1 = super/*androidx.fragment.app.FragmentActivity*/.onCreateView(r1, r2, r3, r4)
            return r1
    }

    public android.view.View zeusSuperOnCreateView(java.lang.String r1, android.content.Context r2, android.util.AttributeSet r3) {
            r0 = this;
            android.view.View r1 = super/*androidx.fragment.app.FragmentActivity*/.onCreateView(r1, r2, r3)
            return r1
    }

    protected void zeusSuperOnDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    public void zeusSuperOnDetachedFromWindow() {
            r0 = this;
            super/*android.app.Activity*/.onDetachedFromWindow()
            return
    }

    public void zeusSuperOnEnterAnimationComplete() {
            r0 = this;
            super/*android.app.Activity*/.onEnterAnimationComplete()
            return
    }

    public boolean zeusSuperOnGenericMotionEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onGenericMotionEvent(r1)
            return r1
    }

    public void zeusSuperOnGetDirectActions(android.os.CancellationSignal r1, java.util.function.Consumer r2) {
            r0 = this;
            super/*android.app.Activity*/.onGetDirectActions(r1, r2)
            return
    }

    public boolean zeusSuperOnKeyDown(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyDown(r1, r2)
            return r1
    }

    public boolean zeusSuperOnKeyLongPress(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onKeyLongPress(r1, r2)
            return r1
    }

    public boolean zeusSuperOnKeyMultiple(int r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onKeyMultiple(r1, r2, r3)
            return r1
    }

    public boolean zeusSuperOnKeyShortcut(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onKeyShortcut(r1, r2)
            return r1
    }

    public boolean zeusSuperOnKeyUp(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onKeyUp(r1, r2)
            return r1
    }

    public void zeusSuperOnLocalVoiceInteractionStarted() {
            r0 = this;
            super/*android.app.Activity*/.onLocalVoiceInteractionStarted()
            return
    }

    public void zeusSuperOnLocalVoiceInteractionStopped() {
            r0 = this;
            super/*android.app.Activity*/.onLocalVoiceInteractionStopped()
            return
    }

    public void zeusSuperOnLowMemory() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onLowMemory()
            return
    }

    public boolean zeusSuperOnMenuOpened(int r1, android.view.Menu r2) {
            r0 = this;
            boolean r1 = super.onMenuOpened(r1, r2)
            return r1
    }

    public void zeusSuperOnMultiWindowModeChanged(boolean r1) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onMultiWindowModeChanged(r1)
            return
    }

    public void zeusSuperOnMultiWindowModeChanged(boolean r1, android.content.res.Configuration r2) {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.onMultiWindowModeChanged(r1, r2)
            return
    }

    public boolean zeusSuperOnNavigateUp() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.onNavigateUp()
            return r0
    }

    public boolean zeusSuperOnNavigateUpFromChild(android.app.Activity r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onNavigateUpFromChild(r1)
            return r1
    }

    protected void zeusSuperOnNewIntent(android.content.Intent r1) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onNewIntent(r1)
            return
    }

    public boolean zeusSuperOnOptionsItemSelected(android.view.MenuItem r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onOptionsItemSelected(r1)
            return r1
    }

    public void zeusSuperOnOptionsMenuClosed(android.view.Menu r1) {
            r0 = this;
            super/*android.app.Activity*/.onOptionsMenuClosed(r1)
            return
    }

    public void zeusSuperOnPanelClosed(int r1, android.view.Menu r2) {
            r0 = this;
            super.onPanelClosed(r1, r2)
            return
    }

    protected void zeusSuperOnPause() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            return
    }

    public void zeusSuperOnPerformDirectAction(java.lang.String r1, android.os.Bundle r2, android.os.CancellationSignal r3, java.util.function.Consumer r4) {
            r0 = this;
            super/*android.app.Activity*/.onPerformDirectAction(r1, r2, r3, r4)
            return
    }

    public void zeusSuperOnPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onPictureInPictureModeChanged(r1)
            return
    }

    public void zeusSuperOnPictureInPictureModeChanged(boolean r1, android.content.res.Configuration r2) {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.onPictureInPictureModeChanged(r1, r2)
            return
    }

    public boolean zeusSuperOnPictureInPictureRequested() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.onPictureInPictureRequested()
            return r0
    }

    protected void zeusSuperOnPostCreate(android.os.Bundle r1) {
            r0 = this;
            super.onPostCreate(r1)
            return
    }

    public void zeusSuperOnPostCreate(android.os.Bundle r1, android.os.PersistableBundle r2) {
            r0 = this;
            super/*android.app.Activity*/.onPostCreate(r1, r2)
            return
    }

    protected void zeusSuperOnPostResume() {
            r0 = this;
            super.onPostResume()
            return
    }

    protected void zeusSuperOnPrepareDialog(int r1, android.app.Dialog r2) {
            r0 = this;
            super/*android.app.Activity*/.onPrepareDialog(r1, r2)
            return
    }

    protected void zeusSuperOnPrepareDialog(int r1, android.app.Dialog r2, android.os.Bundle r3) {
            r0 = this;
            super/*android.app.Activity*/.onPrepareDialog(r1, r2, r3)
            return
    }

    public void zeusSuperOnPrepareNavigateUpTaskStack(android.app.TaskStackBuilder r1) {
            r0 = this;
            super/*android.app.Activity*/.onPrepareNavigateUpTaskStack(r1)
            return
    }

    public boolean zeusSuperOnPrepareOptionsMenu(android.view.Menu r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onPrepareOptionsMenu(r1)
            return r1
    }

    public boolean zeusSuperOnPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            boolean r1 = super/*androidx.fragment.app.FragmentActivity*/.onPreparePanel(r1, r2, r3)
            return r1
    }

    public void zeusSuperOnProvideAssistContent(android.app.assist.AssistContent r1) {
            r0 = this;
            super/*android.app.Activity*/.onProvideAssistContent(r1)
            return
    }

    public void zeusSuperOnProvideAssistData(android.os.Bundle r1) {
            r0 = this;
            super/*android.app.Activity*/.onProvideAssistData(r1)
            return
    }

    public void zeusSuperOnProvideKeyboardShortcuts(java.util.List r1, android.view.Menu r2, int r3) {
            r0 = this;
            super/*android.app.Activity*/.onProvideKeyboardShortcuts(r1, r2, r3)
            return
    }

    public android.net.Uri zeusSuperOnProvideReferrer() {
            r1 = this;
            android.net.Uri r0 = super/*android.app.Activity*/.onProvideReferrer()
            return r0
    }

    public void zeusSuperOnRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(r1, r2, r3)
            return
    }

    protected void zeusSuperOnRestart() {
            r0 = this;
            super/*android.app.Activity*/.onRestart()
            return
    }

    protected void zeusSuperOnRestoreInstanceState(android.os.Bundle r1) {
            r0 = this;
            super/*android.app.Activity*/.onRestoreInstanceState(r1)
            return
    }

    public void zeusSuperOnRestoreInstanceState(android.os.Bundle r1, android.os.PersistableBundle r2) {
            r0 = this;
            super/*android.app.Activity*/.onRestoreInstanceState(r1, r2)
            return
    }

    protected void zeusSuperOnResume() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            return
    }

    protected void zeusSuperOnSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(r1)
            return
    }

    public void zeusSuperOnSaveInstanceState(android.os.Bundle r1, android.os.PersistableBundle r2) {
            r0 = this;
            super/*android.app.Activity*/.onSaveInstanceState(r1, r2)
            return
    }

    public boolean zeusSuperOnSearchRequested() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.onSearchRequested()
            return r0
    }

    public boolean zeusSuperOnSearchRequested(android.view.SearchEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onSearchRequested(r1)
            return r1
    }

    protected void zeusSuperOnStart() {
            r0 = this;
            super.onStart()
            return
    }

    public void zeusSuperOnStateNotSaved() {
            r0 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onStateNotSaved()
            return
    }

    protected void zeusSuperOnStop() {
            r0 = this;
            super.onStop()
            return
    }

    protected void zeusSuperOnTitleChanged(java.lang.CharSequence r1, int r2) {
            r0 = this;
            super.onTitleChanged(r1, r2)
            return
    }

    public void zeusSuperOnTopResumedActivityChanged(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.onTopResumedActivityChanged(r1)
            return
    }

    public boolean zeusSuperOnTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onTouchEvent(r1)
            return r1
    }

    public boolean zeusSuperOnTrackballEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.onTrackballEvent(r1)
            return r1
    }

    public void zeusSuperOnTrimMemory(int r1) {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.onTrimMemory(r1)
            return
    }

    public void zeusSuperOnUserInteraction() {
            r0 = this;
            super/*android.app.Activity*/.onUserInteraction()
            return
    }

    protected void zeusSuperOnUserLeaveHint() {
            r0 = this;
            super/*android.app.Activity*/.onUserLeaveHint()
            return
    }

    public void zeusSuperOnVisibleBehindCanceled() {
            r0 = this;
            super/*android.app.Activity*/.onVisibleBehindCanceled()
            return
    }

    public void zeusSuperOnWindowAttributesChanged(android.view.WindowManager.LayoutParams r1) {
            r0 = this;
            super/*android.app.Activity*/.onWindowAttributesChanged(r1)
            return
    }

    public void zeusSuperOnWindowFocusChanged(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.onWindowFocusChanged(r1)
            return
    }

    public android.view.ActionMode zeusSuperOnWindowStartingActionMode(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode r1 = super/*android.app.Activity*/.onWindowStartingActionMode(r1)
            return r1
    }

    public android.view.ActionMode zeusSuperOnWindowStartingActionMode(android.view.ActionMode.Callback r1, int r2) {
            r0 = this;
            android.view.ActionMode r1 = super/*android.app.Activity*/.onWindowStartingActionMode(r1, r2)
            return r1
    }

    public void zeusSuperOpenContextMenu(android.view.View r1) {
            r0 = this;
            super/*android.app.Activity*/.openContextMenu(r1)
            return
    }

    public void zeusSuperOpenOptionsMenu() {
            r0 = this;
            super.openOptionsMenu()
            return
    }

    public void zeusSuperOverridePendingTransition(int r1, int r2) {
            r0 = this;
            super/*android.app.Activity*/.overridePendingTransition(r1, r2)
            return
    }

    public void zeusSuperPostponeEnterTransition() {
            r0 = this;
            super/*android.app.Activity*/.postponeEnterTransition()
            return
    }

    public void zeusSuperRecreate() {
            r0 = this;
            super/*android.app.Activity*/.recreate()
            return
    }

    public void zeusSuperRegisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r1) {
            r0 = this;
            super/*android.app.Activity*/.registerActivityLifecycleCallbacks(r1)
            return
    }

    public void zeusSuperRegisterForContextMenu(android.view.View r1) {
            r0 = this;
            super/*android.app.Activity*/.registerForContextMenu(r1)
            return
    }

    public boolean zeusSuperReleaseInstance() {
            r1 = this;
            boolean r0 = super/*android.app.Activity*/.releaseInstance()
            return r0
    }

    public void zeusSuperReportFullyDrawn() {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.reportFullyDrawn()
            return
    }

    public android.view.DragAndDropPermissions zeusSuperRequestDragAndDropPermissions(android.view.DragEvent r1) {
            r0 = this;
            android.view.DragAndDropPermissions r1 = super/*android.app.Activity*/.requestDragAndDropPermissions(r1)
            return r1
    }

    public boolean zeusSuperRequestVisibleBehind(boolean r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.requestVisibleBehind(r1)
            return r1
    }

    public void zeusSuperSetActionBar(android.widget.Toolbar r1) {
            r0 = this;
            super/*android.app.Activity*/.setActionBar(r1)
            return
    }

    public void zeusSuperSetContentTransitionManager(android.transition.TransitionManager r1) {
            r0 = this;
            super/*android.app.Activity*/.setContentTransitionManager(r1)
            return
    }

    public void zeusSuperSetContentView(int r1) {
            r0 = this;
            super.setContentView(r1)
            return
    }

    public void zeusSuperSetContentView(android.view.View r1) {
            r0 = this;
            super.setContentView(r1)
            return
    }

    public void zeusSuperSetContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            super.setContentView(r1, r2)
            return
    }

    public void zeusSuperSetEnterSharedElementCallback(android.app.SharedElementCallback r1) {
            r0 = this;
            super/*android.app.Activity*/.setEnterSharedElementCallback(r1)
            return
    }

    public void zeusSuperSetExitSharedElementCallback(android.app.SharedElementCallback r1) {
            r0 = this;
            super/*android.app.Activity*/.setExitSharedElementCallback(r1)
            return
    }

    public void zeusSuperSetFinishOnTouchOutside(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.setFinishOnTouchOutside(r1)
            return
    }

    public void zeusSuperSetImmersive(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.setImmersive(r1)
            return
    }

    public void zeusSuperSetInheritShowWhenLocked(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.setInheritShowWhenLocked(r1)
            return
    }

    public void zeusSuperSetIntent(android.content.Intent r1) {
            r0 = this;
            super/*android.app.Activity*/.setIntent(r1)
            return
    }

    public void zeusSuperSetLocusContext(android.content.LocusId r1, android.os.Bundle r2) {
            r0 = this;
            super/*android.app.Activity*/.setLocusContext(r1, r2)
            return
    }

    public void zeusSuperSetPictureInPictureParams(android.app.PictureInPictureParams r1) {
            r0 = this;
            super/*android.app.Activity*/.setPictureInPictureParams(r1)
            return
    }

    public void zeusSuperSetRequestedOrientation(int r1) {
            r0 = this;
            super/*android.app.Activity*/.setRequestedOrientation(r1)
            return
    }

    public void zeusSuperSetShowWhenLocked(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.setShowWhenLocked(r1)
            return
    }

    public void zeusSuperSetTaskDescription(android.app.ActivityManager.TaskDescription r1) {
            r0 = this;
            super/*android.app.Activity*/.setTaskDescription(r1)
            return
    }

    @Override // com.bytedance.pangle.activity.xt
    public void zeusSuperSetTheme(int r1) {
            r0 = this;
            super.setTheme(r1)
            return
    }

    public void zeusSuperSetTitle(int r1) {
            r0 = this;
            super/*android.app.Activity*/.setTitle(r1)
            return
    }

    public void zeusSuperSetTitle(java.lang.CharSequence r1) {
            r0 = this;
            super/*android.app.Activity*/.setTitle(r1)
            return
    }

    public void zeusSuperSetTitleColor(int r1) {
            r0 = this;
            super/*android.app.Activity*/.setTitleColor(r1)
            return
    }

    public boolean zeusSuperSetTranslucent(boolean r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.setTranslucent(r1)
            return r1
    }

    public void zeusSuperSetTurnScreenOn(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.setTurnScreenOn(r1)
            return
    }

    public void zeusSuperSetVisible(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.setVisible(r1)
            return
    }

    public void zeusSuperSetVrModeEnabled(boolean r1, android.content.ComponentName r2) throws android.content.pm.PackageManager.NameNotFoundException {
            r0 = this;
            super/*android.app.Activity*/.setVrModeEnabled(r1, r2)
            return
    }

    public boolean zeusSuperShouldShowRequestPermissionRationale(java.lang.String r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.shouldShowRequestPermissionRationale(r1)
            return r1
    }

    public boolean zeusSuperShouldUpRecreateTask(android.content.Intent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.shouldUpRecreateTask(r1)
            return r1
    }

    public boolean zeusSuperShowAssist(android.os.Bundle r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.showAssist(r1)
            return r1
    }

    public void zeusSuperShowLockTaskEscapeMessage() {
            r0 = this;
            super/*android.app.Activity*/.showLockTaskEscapeMessage()
            return
    }

    public android.view.ActionMode zeusSuperStartActionMode(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode r1 = super/*android.app.Activity*/.startActionMode(r1)
            return r1
    }

    public android.view.ActionMode zeusSuperStartActionMode(android.view.ActionMode.Callback r1, int r2) {
            r0 = this;
            android.view.ActionMode r1 = super/*android.app.Activity*/.startActionMode(r1, r2)
            return r1
    }

    public void zeusSuperStartActivities(android.content.Intent[] r1) {
            r0 = this;
            super/*android.app.Activity*/.startActivities(r1)
            return
    }

    public void zeusSuperStartActivities(android.content.Intent[] r1, android.os.Bundle r2) {
            r0 = this;
            super/*android.app.Activity*/.startActivities(r1, r2)
            return
    }

    public void zeusSuperStartActivity(android.content.Intent r1) {
            r0 = this;
            super/*android.app.Activity*/.startActivity(r1)
            return
    }

    public void zeusSuperStartActivity(android.content.Intent r1, android.os.Bundle r2) {
            r0 = this;
            super/*android.app.Activity*/.startActivity(r1, r2)
            return
    }

    public void zeusSuperStartActivityForResult(android.content.Intent r1, int r2) {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.startActivityForResult(r1, r2)
            return
    }

    public void zeusSuperStartActivityForResult(android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.startActivityForResult(r1, r2, r3)
            return
    }

    public void zeusSuperStartActivityFromChild(android.app.Activity r1, android.content.Intent r2, int r3) {
            r0 = this;
            super/*android.app.Activity*/.startActivityFromChild(r1, r2, r3)
            return
    }

    public void zeusSuperStartActivityFromChild(android.app.Activity r1, android.content.Intent r2, int r3, android.os.Bundle r4) {
            r0 = this;
            super/*android.app.Activity*/.startActivityFromChild(r1, r2, r3, r4)
            return
    }

    public void zeusSuperStartActivityFromFragment(android.app.Fragment r1, android.content.Intent r2, int r3) {
            r0 = this;
            super/*android.app.Activity*/.startActivityFromFragment(r1, r2, r3)
            return
    }

    public void zeusSuperStartActivityFromFragment(android.app.Fragment r1, android.content.Intent r2, int r3, android.os.Bundle r4) {
            r0 = this;
            super/*android.app.Activity*/.startActivityFromFragment(r1, r2, r3, r4)
            return
    }

    public boolean zeusSuperStartActivityIfNeeded(android.content.Intent r1, int r2) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.startActivityIfNeeded(r1, r2)
            return r1
    }

    public boolean zeusSuperStartActivityIfNeeded(android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.startActivityIfNeeded(r1, r2, r3)
            return r1
    }

    public void zeusSuperStartIntentSender(android.content.IntentSender r1, android.content.Intent r2, int r3, int r4, int r5) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super/*android.app.Activity*/.startIntentSender(r1, r2, r3, r4, r5)
            return
    }

    public void zeusSuperStartIntentSender(android.content.IntentSender r1, android.content.Intent r2, int r3, int r4, int r5, android.os.Bundle r6) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super/*android.app.Activity*/.startIntentSender(r1, r2, r3, r4, r5, r6)
            return
    }

    public void zeusSuperStartIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    public void zeusSuperStartIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super/*androidx.activity.ComponentActivity*/.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void zeusSuperStartIntentSenderFromChild(android.app.Activity r1, android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super/*android.app.Activity*/.startIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void zeusSuperStartIntentSenderFromChild(android.app.Activity r1, android.content.IntentSender r2, int r3, android.content.Intent r4, int r5, int r6, int r7, android.os.Bundle r8) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super/*android.app.Activity*/.startIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void zeusSuperStartLocalVoiceInteraction(android.os.Bundle r1) {
            r0 = this;
            super/*android.app.Activity*/.startLocalVoiceInteraction(r1)
            return
    }

    public void zeusSuperStartLockTask() {
            r0 = this;
            super/*android.app.Activity*/.startLockTask()
            return
    }

    public void zeusSuperStartManagingCursor(android.database.Cursor r1) {
            r0 = this;
            super/*android.app.Activity*/.startManagingCursor(r1)
            return
    }

    public boolean zeusSuperStartNextMatchingActivity(android.content.Intent r1) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.startNextMatchingActivity(r1)
            return r1
    }

    public boolean zeusSuperStartNextMatchingActivity(android.content.Intent r1, android.os.Bundle r2) {
            r0 = this;
            boolean r1 = super/*android.app.Activity*/.startNextMatchingActivity(r1, r2)
            return r1
    }

    public void zeusSuperStartPostponedEnterTransition() {
            r0 = this;
            super/*android.app.Activity*/.startPostponedEnterTransition()
            return
    }

    public void zeusSuperStartSearch(java.lang.String r1, boolean r2, android.os.Bundle r3, boolean r4) {
            r0 = this;
            super/*android.app.Activity*/.startSearch(r1, r2, r3, r4)
            return
    }

    public void zeusSuperStopLocalVoiceInteraction() {
            r0 = this;
            super/*android.app.Activity*/.stopLocalVoiceInteraction()
            return
    }

    public void zeusSuperStopLockTask() {
            r0 = this;
            super/*android.app.Activity*/.stopLockTask()
            return
    }

    public void zeusSuperStopManagingCursor(android.database.Cursor r1) {
            r0 = this;
            super/*android.app.Activity*/.stopManagingCursor(r1)
            return
    }

    public void zeusSuperTakeKeyEvents(boolean r1) {
            r0 = this;
            super/*android.app.Activity*/.takeKeyEvents(r1)
            return
    }

    public void zeusSuperTriggerSearch(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            super/*android.app.Activity*/.triggerSearch(r1, r2)
            return
    }

    public void zeusSuperUnregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r1) {
            r0 = this;
            super/*android.app.Activity*/.unregisterActivityLifecycleCallbacks(r1)
            return
    }

    public void zeusSuperUnregisterForContextMenu(android.view.View r1) {
            r0 = this;
            super/*android.app.Activity*/.unregisterForContextMenu(r1)
            return
    }
}
