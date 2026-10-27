package com.bytedance.pangle.wrapper;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class GenerateActivityWrapper extends android.app.Activity implements com.bytedance.pangle.wrapper.j {
    public android.app.Activity mOriginActivity;
    public com.bytedance.pangle.PluginContext pluginContext;

    public GenerateActivityWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.addContentView(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void closeContextMenu() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.closeContextMenu()
            return
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.closeOptionsMenu()
            return
    }

    @Override // android.app.Activity
    public android.app.PendingIntent createPendingResult(int r2, android.content.Intent r3, int r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.app.PendingIntent r2 = r0.createPendingResult(r2, r3, r4)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchKeyEvent(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.app.Activity
    public void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.dump(r2, r3, r4, r5)
            return
    }

    @Override // android.app.Activity
    public void enterPictureInPictureMode() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.s.a(r0)
            return
    }

    @Override // android.app.Activity
    public boolean enterPictureInPictureMode(android.app.PictureInPictureParams r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.k.a(r0, r2)
            return r2
    }

    @Override // android.app.Activity
    public android.view.View findViewById(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    @Override // android.app.Activity
    public void finish() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.finish()
            return
    }

    @Override // android.app.Activity
    public void finishActivity(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.finishActivity(r2)
            return
    }

    @Override // android.app.Activity
    public void finishActivityFromChild(android.app.Activity r2, int r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.finishActivityFromChild(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void finishAffinity() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.finishAffinity()
            return
    }

    @Override // android.app.Activity
    public void finishAfterTransition() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.finishAfterTransition()
            return
    }

    @Override // android.app.Activity
    public void finishAndRemoveTask() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.finishAndRemoveTask()
            return
    }

    @Override // android.app.Activity
    public void finishFromChild(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.finishFromChild(r2)
            return
    }

    @Override // android.app.Activity
    public android.app.ActionBar getActionBar() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.app.ActionBar r0 = r0.getActionBar()
            return r0
    }

    @Override // android.app.Activity
    public android.content.ComponentName getCallingActivity() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.content.ComponentName r0 = r0.getCallingActivity()
            return r0
    }

    @Override // android.app.Activity
    public java.lang.String getCallingPackage() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            java.lang.String r0 = r0.getCallingPackage()
            return r0
    }

    @Override // android.app.Activity
    public int getChangingConfigurations() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    @Override // android.app.Activity
    public android.content.ComponentName getComponentName() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.content.ComponentName r0 = r0.getComponentName()
            return r0
    }

    @Override // android.app.Activity
    public android.transition.Scene getContentScene() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.transition.Scene r0 = r0.getContentScene()
            return r0
    }

    @Override // android.app.Activity
    public android.transition.TransitionManager getContentTransitionManager() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.transition.TransitionManager r0 = r0.getContentTransitionManager()
            return r0
    }

    @Override // android.app.Activity
    public android.view.View getCurrentFocus() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.View r0 = r0.getCurrentFocus()
            return r0
    }

    @Override // android.app.Activity
    public android.app.FragmentManager getFragmentManager() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.app.FragmentManager r0 = r0.getFragmentManager()
            return r0
    }

    @Override // android.app.Activity
    public android.content.Intent getIntent() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    @Override // android.app.Activity
    public java.lang.Object getLastNonConfigurationInstance() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            java.lang.Object r0 = r0.getLastNonConfigurationInstance()
            return r0
    }

    @Override // android.app.Activity
    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            return r0
    }

    @Override // android.app.Activity
    public android.app.LoaderManager getLoaderManager() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.app.LoaderManager r0 = r0.getLoaderManager()
            return r0
    }

    @Override // android.app.Activity
    public java.lang.String getLocalClassName() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            java.lang.String r0 = r0.getLocalClassName()
            return r0
    }

    @Override // android.app.Activity
    public int getMaxNumPictureInPictureActions() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            int r0 = com.bytedance.pangle.wrapper.m.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.MenuInflater r0 = r0.getMenuInflater()
            return r0
    }

    @Override // android.app.Activity
    public android.content.Intent getParentActivityIntent() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.content.Intent r0 = r0.getParentActivityIntent()
            return r0
    }

    @Override // android.app.Activity
    public android.content.SharedPreferences getPreferences(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.content.SharedPreferences r2 = r0.getPreferences(r2)
            return r2
    }

    @Override // android.app.Activity
    public android.net.Uri getReferrer() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.net.Uri r0 = com.bytedance.pangle.wrapper.c.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public int getRequestedOrientation() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            int r0 = r0.getRequestedOrientation()
            return r0
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.PluginContext r0 = r1.pluginContext
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    @Override // android.app.Activity
    public int getTaskId() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            int r0 = r0.getTaskId()
            return r0
    }

    @Override // android.app.Activity
    public android.app.VoiceInteractor getVoiceInteractor() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.app.VoiceInteractor r0 = com.bytedance.pangle.wrapper.f.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public android.view.Window getWindow() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.Window r0 = r0.getWindow()
            return r0
    }

    @Override // android.app.Activity
    public android.view.WindowManager getWindowManager() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.WindowManager r0 = r0.getWindowManager()
            return r0
    }

    @Override // android.app.Activity
    public boolean hasWindowFocus() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.hasWindowFocus()
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            int r0 = r0.hashCode()
            return r0
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Activity
    public boolean isActivityTransitionRunning() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.r.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public boolean isChangingConfigurations() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.isChangingConfigurations()
            return r0
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.isDestroyed()
            return r0
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.isFinishing()
            return r0
    }

    @Override // android.app.Activity
    public boolean isImmersive() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.isImmersive()
            return r0
    }

    @Override // android.app.Activity
    public boolean isInMultiWindowMode() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.k0.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public boolean isInPictureInPictureMode() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.v.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public boolean isLocalVoiceInteractionSupported() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.p0.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public boolean isTaskRoot() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.isTaskRoot()
            return r0
    }

    @Override // android.app.Activity
    public boolean isVoiceInteraction() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.w.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public boolean isVoiceInteractionRoot() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.f0.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.moveTaskToBack(r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean navigateUpTo(android.content.Intent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.navigateUpTo(r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean navigateUpToFromChild(android.app.Activity r2, android.content.Intent r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.navigateUpToFromChild(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.app.Activity
    public void onActivityReenter(int r2, android.content.Intent r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onActivityReenter(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void onAttachFragment(android.app.Fragment r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onAttachFragment(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onAttachedToWindow()
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onBackPressed()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onConfigurationChanged(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onContentChanged()
            return
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onContextItemSelected(r2)
            return r2
    }

    @Override // android.app.Activity
    public void onContextMenuClosed(android.view.Menu r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onContextMenuClosed(r2)
            return
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onCreate(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public java.lang.CharSequence onCreateDescription() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            java.lang.CharSequence r0 = r0.onCreateDescription()
            return r0
    }

    @Override // android.app.Activity
    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onCreateNavigateUpTaskStack(r2)
            return
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onCreateOptionsMenu(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean onCreateThumbnail(android.graphics.Bitmap r2, android.graphics.Canvas r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onCreateThumbnail(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
            return r2
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.View r2 = r0.onCreateView(r2, r3, r4)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onEnterAnimationComplete()
            return
    }

    @Override // android.app.Activity
    public boolean onGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onGenericMotionEvent(r2)
            return r2
    }

    @Override // android.app.Activity
    public void onGetDirectActions(android.os.CancellationSignal r2, java.util.function.Consumer r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.h.a(r0, r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyDown(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int r2, android.view.KeyEvent r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyLongPress(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyMultiple(r2, r3, r4)
            return r2
    }

    @Override // android.app.Activity
    public boolean onKeyShortcut(int r2, android.view.KeyEvent r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyShortcut(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyUp(r2, r3)
            return r2
    }

    @Override // android.app.Activity
    public void onLocalVoiceInteractionStarted() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.l0.a(r0)
            return
    }

    @Override // android.app.Activity
    public void onLocalVoiceInteractionStopped() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.h0.a(r0)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onLowMemory()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.g.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.y.a(r0, r2, r3)
            return
    }

    @Override // android.app.Activity
    public boolean onNavigateUp() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.onNavigateUp()
            return r0
    }

    @Override // android.app.Activity
    public boolean onNavigateUpFromChild(android.app.Activity r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onNavigateUpFromChild(r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onOptionsItemSelected(r2)
            return r2
    }

    @Override // android.app.Activity
    public void onOptionsMenuClosed(android.view.Menu r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onOptionsMenuClosed(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void onPerformDirectAction(java.lang.String r2, android.os.Bundle r3, android.os.CancellationSignal r4, java.util.function.Consumer r5) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.x.a(r0, r2, r3, r4, r5)
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.q.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.t.a(r0, r2, r3)
            return
    }

    @Override // android.app.Activity
    public boolean onPictureInPictureRequested() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.a0.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public void onPostCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onPostCreate(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onPrepareNavigateUpTaskStack(r2)
            return
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onPrepareOptionsMenu(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
    }

    @Override // android.app.Activity
    public void onProvideAssistContent(android.app.assist.AssistContent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.b.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void onProvideAssistData(android.os.Bundle r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onProvideAssistData(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List r2, android.view.Menu r3, int r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.u.a(r0, r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public android.net.Uri onProvideReferrer() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.net.Uri r0 = com.bytedance.pangle.wrapper.d.a(r0)
            return r0
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.stub.StubApp.interface22(r2, r3, r4)
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.n.a(r0, r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onRestoreInstanceState(r2, r3)
            return
    }

    @Override // android.app.Activity
    public java.lang.Object onRetainNonConfigurationInstance() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            java.lang.Object r0 = r0.onRetainNonConfigurationInstance()
            return r0
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onSaveInstanceState(r2, r3)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.a.a(r0, r2)
            return r2
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.d0.a(r0)
            return
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.r0.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onTouchEvent(r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean onTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.onTrackballEvent(r2)
            return r2
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onTrimMemory(r2)
            return
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onUserInteraction()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.onWindowFocusChanged(r2)
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = com.bytedance.pangle.wrapper.e0.a(r0, r2, r3)
            return r2
    }

    @Override // android.app.Activity
    public void openContextMenu(android.view.View r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.openContextMenu(r2)
            return
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.openOptionsMenu()
            return
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int r2, int r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.overridePendingTransition(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void postponeEnterTransition() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.postponeEnterTransition()
            return
    }

    @Override // android.app.Activity
    public void recreate() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.recreate()
            return
    }

    @Override // android.app.Activity
    public void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            androidx.lifecycle.j.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void registerForContextMenu(android.view.View r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.registerForContextMenu(r2)
            return
    }

    @Override // android.app.Activity
    public boolean releaseInstance() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r0 = r0.releaseInstance()
            return r0
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.reportFullyDrawn()
            return
    }

    @Override // android.app.Activity
    public android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.DragAndDropPermissions r2 = com.bytedance.pangle.wrapper.g0.a(r0, r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean requestVisibleBehind(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.requestVisibleBehind(r2)
            return r2
    }

    @Override // android.app.Activity
    public void setActionBar(android.widget.Toolbar r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setActionBar(r2)
            return
    }

    @Override // android.app.Activity
    public void setContentTransitionManager(android.transition.TransitionManager r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setContentTransitionManager(r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setContentView(r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setContentView(r2)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setContentView(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void setEnterSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setEnterSharedElementCallback(r2)
            return
    }

    @Override // android.app.Activity
    public void setExitSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setExitSharedElementCallback(r2)
            return
    }

    @Override // android.app.Activity
    public void setFinishOnTouchOutside(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setFinishOnTouchOutside(r2)
            return
    }

    @Override // android.app.Activity
    public void setImmersive(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setImmersive(r2)
            return
    }

    @Override // android.app.Activity
    public void setInheritShowWhenLocked(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.q0.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void setIntent(android.content.Intent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setIntent(r2)
            return
    }

    @Override // android.app.Activity
    public void setLocusContext(android.content.LocusId r2, android.os.Bundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.e.a(r0, r2, r3)
            return
    }

    @Override // android.app.Activity
    public void setPictureInPictureParams(android.app.PictureInPictureParams r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.b0.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setRequestedOrientation(r2)
            return
    }

    @Override // android.app.Activity
    public void setShowWhenLocked(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.c0.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void setTaskDescription(android.app.ActivityManager.TaskDescription r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setTaskDescription(r2)
            return
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setTheme(r2)
            return
    }

    @Override // android.app.Activity
    public void setTitle(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setTitle(r2)
            return
    }

    @Override // android.app.Activity
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setTitle(r2)
            return
    }

    @Override // android.app.Activity
    public void setTitleColor(int r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setTitleColor(r2)
            return
    }

    @Override // android.app.Activity
    public boolean setTranslucent(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.i0.a(r0, r2)
            return r2
    }

    @Override // android.app.Activity
    public void setTurnScreenOn(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.z.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void setVisible(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.setVisible(r2)
            return
    }

    @Override // android.app.Activity
    public void setVrModeEnabled(boolean r2, android.content.ComponentName r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.o.a(r0, r2, r3)
            return
    }

    @Override // com.bytedance.pangle.wrapper.j
    public void setWrapperActivityTheme(int r1) {
            r0 = this;
            super.setTheme(r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    @Override // android.app.Activity
    public boolean shouldShowRequestPermissionRationale(java.lang.String r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.j0.a(r0, r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean shouldUpRecreateTask(android.content.Intent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.shouldUpRecreateTask(r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean showAssist(android.os.Bundle r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.m0.a(r0, r2)
            return r2
    }

    @Override // android.app.Activity
    public void showLockTaskEscapeMessage() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.p.a(r0)
            return
    }

    @Override // android.app.Activity
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = r0.startActionMode(r2)
            return r2
    }

    @Override // android.app.Activity
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = com.bytedance.pangle.wrapper.l.a(r0, r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivities(r2)
            return
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] r2, android.os.Bundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivities(r2, r3)
            return
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivity(r2)
            return
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivity(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivityForResult(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivityForResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivityFromChild(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivityFromChild(r2, r3, r4, r5)
            return
    }

    @Override // android.app.Activity
    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivityFromFragment(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startActivityFromFragment(r2, r3, r4, r5)
            return
    }

    @Override // android.app.Activity
    public boolean startActivityIfNeeded(android.content.Intent r2, int r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.startActivityIfNeeded(r2, r3)
            return r2
    }

    @Override // android.app.Activity
    public boolean startActivityIfNeeded(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.startActivityIfNeeded(r2, r3, r4)
            return r2
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startIntentSender(android.content.IntentSender r7, android.content.Intent r8, int r9, int r10, int r11) throws android.content.IntentSender.SendIntentException {
            r6 = this;
            android.app.Activity r0 = r6.mOriginActivity
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.startIntentSender(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startIntentSender(android.content.IntentSender r8, android.content.Intent r9, int r10, int r11, int r12, android.os.Bundle r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            android.app.Activity r0 = r7.mOriginActivity
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.startIntentSender(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender r8, int r9, android.content.Intent r10, int r11, int r12, int r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            android.app.Activity r0 = r7.mOriginActivity
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(android.content.IntentSender r9, int r10, android.content.Intent r11, int r12, int r13, int r14, android.os.Bundle r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            android.app.Activity r0 = r8.mOriginActivity
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderFromChild(android.app.Activity r9, android.content.IntentSender r10, int r11, android.content.Intent r12, int r13, int r14, int r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            android.app.Activity r0 = r8.mOriginActivity
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.startIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.app.Activity
    public void startIntentSenderFromChild(android.app.Activity r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            android.app.Activity r0 = r9.mOriginActivity
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
    }

    @Override // android.app.Activity
    public void startLocalVoiceInteraction(android.os.Bundle r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.o0.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void startLockTask() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startLockTask()
            return
    }

    @Override // android.app.Activity
    public void startManagingCursor(android.database.Cursor r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startManagingCursor(r2)
            return
    }

    @Override // android.app.Activity
    public boolean startNextMatchingActivity(android.content.Intent r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.startNextMatchingActivity(r2)
            return r2
    }

    @Override // android.app.Activity
    public boolean startNextMatchingActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            boolean r2 = r0.startNextMatchingActivity(r2, r3)
            return r2
    }

    @Override // android.app.Activity
    public void startPostponedEnterTransition() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startPostponedEnterTransition()
            return
    }

    @Override // android.app.Activity
    public void startSearch(java.lang.String r2, boolean r3, android.os.Bundle r4, boolean r5) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.startSearch(r2, r3, r4, r5)
            return
    }

    @Override // android.app.Activity
    public void stopLocalVoiceInteraction() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.n0.a(r0)
            return
    }

    @Override // android.app.Activity
    public void stopLockTask() {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.stopLockTask()
            return
    }

    @Override // android.app.Activity
    public void stopManagingCursor(android.database.Cursor r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.stopManagingCursor(r2)
            return
    }

    @Override // android.app.Activity
    public void takeKeyEvents(boolean r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.takeKeyEvents(r2)
            return
    }

    @Override // android.app.Activity
    public void triggerSearch(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.triggerSearch(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.i.a(r0, r2)
            return
    }

    @Override // android.app.Activity
    public void unregisterForContextMenu(android.view.View r2) {
            r1 = this;
            android.app.Activity r0 = r1.mOriginActivity
            r0.unregisterForContextMenu(r2)
            return
    }
}
