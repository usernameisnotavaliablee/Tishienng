package com.bytedance.pangle.wrapper;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class GenerateFragmentActivityWrapper extends androidx.fragment.app.FragmentActivity implements com.bytedance.pangle.wrapper.j {
    public androidx.fragment.app.FragmentActivity mOriginActivity;
    public com.bytedance.pangle.PluginContext pluginContext;

    public GenerateFragmentActivityWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.addContentView(r2, r3)
            return
    }

    public void closeContextMenu() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.closeContextMenu()
            return
    }

    public void closeOptionsMenu() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.closeOptionsMenu()
            return
    }

    public android.app.PendingIntent createPendingResult(int r2, android.content.Intent r3, int r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.app.PendingIntent r2 = r0.createPendingResult(r2, r3, r4)
            return r2
    }

    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchKeyEvent(r2)
            return r2
    }

    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)
            return r2
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    public void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.dump(r2, r3, r4, r5)
            return
    }

    public void enterPictureInPictureMode() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.r1.a(r0)
            return
    }

    public boolean enterPictureInPictureMode(android.app.PictureInPictureParams r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.g1.a(r0, r2)
            return r2
    }

    public android.view.View findViewById(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    public void finish() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.finish()
            return
    }

    public void finishActivity(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.finishActivity(r2)
            return
    }

    public void finishActivityFromChild(android.app.Activity r2, int r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.finishActivityFromChild(r2, r3)
            return
    }

    public void finishAffinity() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.finishAffinity()
            return
    }

    public void finishAfterTransition() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.finishAfterTransition()
            return
    }

    public void finishAndRemoveTask() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.finishAndRemoveTask()
            return
    }

    public void finishFromChild(android.app.Activity r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.finishFromChild(r2)
            return
    }

    public android.app.ActionBar getActionBar() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.app.ActionBar r0 = r0.getActionBar()
            return r0
    }

    public android.content.ComponentName getCallingActivity() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.content.ComponentName r0 = r0.getCallingActivity()
            return r0
    }

    public java.lang.String getCallingPackage() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            java.lang.String r0 = r0.getCallingPackage()
            return r0
    }

    public int getChangingConfigurations() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            int r0 = r0.getChangingConfigurations()
            return r0
    }

    public android.content.ComponentName getComponentName() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.content.ComponentName r0 = r0.getComponentName()
            return r0
    }

    public android.transition.Scene getContentScene() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.transition.Scene r0 = r0.getContentScene()
            return r0
    }

    public android.transition.TransitionManager getContentTransitionManager() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.transition.TransitionManager r0 = r0.getContentTransitionManager()
            return r0
    }

    public android.view.View getCurrentFocus() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.View r0 = r0.getCurrentFocus()
            return r0
    }

    public androidx.core.app.ComponentActivity.ExtraData getExtraData(java.lang.Class r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            androidx.core.app.ComponentActivity$ExtraData r2 = r0.getExtraData(r2)
            return r2
    }

    public android.app.FragmentManager getFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.app.FragmentManager r0 = r0.getFragmentManager()
            return r0
    }

    public android.content.Intent getIntent() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.content.Intent r0 = r0.getIntent()
            return r0
    }

    public java.lang.Object getLastNonConfigurationInstance() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            java.lang.Object r0 = r0.getLastNonConfigurationInstance()
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            return r0
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            return r0
    }

    public android.app.LoaderManager getLoaderManager() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.app.LoaderManager r0 = r0.getLoaderManager()
            return r0
    }

    public java.lang.String getLocalClassName() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            java.lang.String r0 = r0.getLocalClassName()
            return r0
    }

    public int getMaxNumPictureInPictureActions() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            int r0 = com.bytedance.pangle.wrapper.w1.a(r0)
            return r0
    }

    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.MenuInflater r0 = r0.getMenuInflater()
            return r0
    }

    public android.content.Intent getParentActivityIntent() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.content.Intent r0 = r0.getParentActivityIntent()
            return r0
    }

    public android.content.SharedPreferences getPreferences(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.content.SharedPreferences r2 = r0.getPreferences(r2)
            return r2
    }

    public android.net.Uri getReferrer() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.net.Uri r0 = com.bytedance.pangle.wrapper.o1.a(r0)
            return r0
    }

    public int getRequestedOrientation() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            int r0 = r0.getRequestedOrientation()
            return r0
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            return r0
    }

    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            androidx.loader.app.LoaderManager r0 = r0.getSupportLoaderManager()
            return r0
    }

    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.PluginContext r0 = r1.pluginContext
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    public int getTaskId() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            int r0 = r0.getTaskId()
            return r0
    }

    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            return r0
    }

    public android.app.VoiceInteractor getVoiceInteractor() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.app.VoiceInteractor r0 = com.bytedance.pangle.wrapper.b1.a(r0)
            return r0
    }

    public android.view.Window getWindow() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.Window r0 = r0.getWindow()
            return r0
    }

    public android.view.WindowManager getWindowManager() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.WindowManager r0 = r0.getWindowManager()
            return r0
    }

    public boolean hasWindowFocus() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.hasWindowFocus()
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            int r0 = r0.hashCode()
            return r0
    }

    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.invalidateOptionsMenu()
            return
    }

    public boolean isActivityTransitionRunning() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.a1.a(r0)
            return r0
    }

    public boolean isChangingConfigurations() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.isChangingConfigurations()
            return r0
    }

    public boolean isDestroyed() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.isDestroyed()
            return r0
    }

    public boolean isFinishing() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.isFinishing()
            return r0
    }

    public boolean isImmersive() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.isImmersive()
            return r0
    }

    public boolean isInMultiWindowMode() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.a2.a(r0)
            return r0
    }

    public boolean isInPictureInPictureMode() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.e1.a(r0)
            return r0
    }

    public boolean isLocalVoiceInteractionSupported() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.t0.a(r0)
            return r0
    }

    public boolean isTaskRoot() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.isTaskRoot()
            return r0
    }

    public boolean isVoiceInteraction() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.x1.a(r0)
            return r0
    }

    public boolean isVoiceInteractionRoot() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.b2.a(r0)
            return r0
    }

    public boolean moveTaskToBack(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.moveTaskToBack(r2)
            return r2
    }

    public boolean navigateUpTo(android.content.Intent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.navigateUpTo(r2)
            return r2
    }

    public boolean navigateUpToFromChild(android.app.Activity r2, android.content.Intent r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.navigateUpToFromChild(r2, r3)
            return r2
    }

    public void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onActionModeFinished(r2)
            return
    }

    public void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onActionModeStarted(r2)
            return
    }

    public void onActivityReenter(int r2, android.content.Intent r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onActivityReenter(r2, r3)
            return
    }

    public void onAttachFragment(android.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onAttachFragment(r2)
            return
    }

    public void onAttachFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onAttachFragment(r2)
            return
    }

    public void onAttachedToWindow() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onAttachedToWindow()
            return
    }

    public void onBackPressed() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onBackPressed()
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onConfigurationChanged(r2)
            return
    }

    public void onContentChanged() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onContentChanged()
            return
    }

    public boolean onContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onContextItemSelected(r2)
            return r2
    }

    public void onContextMenuClosed(android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onContextMenuClosed(r2)
            return
    }

    public void onCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onCreate(r2, r3)
            return
    }

    public void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    public java.lang.CharSequence onCreateDescription() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            java.lang.CharSequence r0 = r0.onCreateDescription()
            return r0
    }

    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onCreateNavigateUpTaskStack(r2)
            return
    }

    public boolean onCreateOptionsMenu(android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onCreateOptionsMenu(r2)
            return r2
    }

    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    public boolean onCreateThumbnail(android.graphics.Bitmap r2, android.graphics.Canvas r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onCreateThumbnail(r2, r3)
            return r2
    }

    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
            return r2
    }

    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.View r2 = r0.onCreateView(r2, r3, r4)
            return r2
    }

    public void onDetachedFromWindow() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onDetachedFromWindow()
            return
    }

    public void onEnterAnimationComplete() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onEnterAnimationComplete()
            return
    }

    public boolean onGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onGenericMotionEvent(r2)
            return r2
    }

    public void onGetDirectActions(android.os.CancellationSignal r2, java.util.function.Consumer r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.m1.a(r0, r2, r3)
            return
    }

    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyDown(r2, r3)
            return r2
    }

    public boolean onKeyLongPress(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyLongPress(r2, r3)
            return r2
    }

    public boolean onKeyMultiple(int r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyMultiple(r2, r3, r4)
            return r2
    }

    public boolean onKeyShortcut(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyShortcut(r2, r3)
            return r2
    }

    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onKeyUp(r2, r3)
            return r2
    }

    public void onLocalVoiceInteractionStarted() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.z0.a(r0)
            return
    }

    public void onLocalVoiceInteractionStopped() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.p1.a(r0)
            return
    }

    public void onLowMemory() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onLowMemory()
            return
    }

    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    public void onMultiWindowModeChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onMultiWindowModeChanged(r2)
            return
    }

    public void onMultiWindowModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onMultiWindowModeChanged(r2, r3)
            return
    }

    public boolean onNavigateUp() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.onNavigateUp()
            return r0
    }

    public boolean onNavigateUpFromChild(android.app.Activity r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onNavigateUpFromChild(r2)
            return r2
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onOptionsItemSelected(r2)
            return r2
    }

    public void onOptionsMenuClosed(android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onOptionsMenuClosed(r2)
            return
    }

    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onPanelClosed(r2, r3)
            return
    }

    public void onPerformDirectAction(java.lang.String r2, android.os.Bundle r3, android.os.CancellationSignal r4, java.util.function.Consumer r5) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.u1.a(r0, r2, r3, r4, r5)
            return
    }

    public void onPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onPictureInPictureModeChanged(r2)
            return
    }

    public void onPictureInPictureModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onPictureInPictureModeChanged(r2, r3)
            return
    }

    public boolean onPictureInPictureRequested() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = com.bytedance.pangle.wrapper.l1.a(r0)
            return r0
    }

    public void onPostCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onPostCreate(r2, r3)
            return
    }

    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onPrepareNavigateUpTaskStack(r2)
            return
    }

    public boolean onPrepareOptionsMenu(android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onPrepareOptionsMenu(r2)
            return r2
    }

    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
    }

    public void onProvideAssistContent(android.app.assist.AssistContent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.c1.a(r0, r2)
            return
    }

    public void onProvideAssistData(android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onProvideAssistData(r2)
            return
    }

    public void onProvideKeyboardShortcuts(java.util.List r2, android.view.Menu r3, int r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.u0.a(r0, r2, r3, r4)
            return
    }

    public android.net.Uri onProvideReferrer() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.net.Uri r0 = com.bytedance.pangle.wrapper.z1.a(r0)
            return r0
    }

    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.stub.StubApp.interface22(r2, r3, r4)
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    public void onRestoreInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onRestoreInstanceState(r2, r3)
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onSaveInstanceState(r2, r3)
            return
    }

    public boolean onSearchRequested() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.y1.a(r0, r2)
            return r2
    }

    public void onStateNotSaved() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onStateNotSaved()
            return
    }

    public void onTopResumedActivityChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.v0.a(r0, r2)
            return
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onTouchEvent(r2)
            return r2
    }

    public boolean onTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.onTrackballEvent(r2)
            return r2
    }

    public void onTrimMemory(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onTrimMemory(r2)
            return
    }

    public void onUserInteraction() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onUserInteraction()
            return
    }

    public void onVisibleBehindCanceled() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onVisibleBehindCanceled()
            return
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onWindowAttributesChanged(r2)
            return
    }

    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.onWindowFocusChanged(r2)
            return
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2)
            return r2
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = com.bytedance.pangle.wrapper.x0.a(r0, r2, r3)
            return r2
    }

    public void openContextMenu(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.openContextMenu(r2)
            return
    }

    public void openOptionsMenu() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.openOptionsMenu()
            return
    }

    public void overridePendingTransition(int r2, int r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.overridePendingTransition(r2, r3)
            return
    }

    public void postponeEnterTransition() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.postponeEnterTransition()
            return
    }

    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.putExtraData(r2)
            return
    }

    public void recreate() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.recreate()
            return
    }

    public void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.t1.a(r0, r2)
            return
    }

    public void registerForContextMenu(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.registerForContextMenu(r2)
            return
    }

    public boolean releaseInstance() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r0 = r0.releaseInstance()
            return r0
    }

    public void reportFullyDrawn() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.reportFullyDrawn()
            return
    }

    public android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.DragAndDropPermissions r2 = com.bytedance.pangle.wrapper.k1.a(r0, r2)
            return r2
    }

    public boolean requestVisibleBehind(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.requestVisibleBehind(r2)
            return r2
    }

    public void setActionBar(android.widget.Toolbar r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setActionBar(r2)
            return
    }

    public void setContentTransitionManager(android.transition.TransitionManager r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setContentTransitionManager(r2)
            return
    }

    public void setContentView(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setContentView(r2)
            return
    }

    public void setContentView(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setContentView(r2)
            return
    }

    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setContentView(r2, r3)
            return
    }

    public void setEnterSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setEnterSharedElementCallback(r2)
            return
    }

    public void setEnterSharedElementCallback(androidx.core.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setEnterSharedElementCallback(r2)
            return
    }

    public void setExitSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setExitSharedElementCallback(r2)
            return
    }

    public void setExitSharedElementCallback(androidx.core.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setExitSharedElementCallback(r2)
            return
    }

    public void setFinishOnTouchOutside(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setFinishOnTouchOutside(r2)
            return
    }

    public void setImmersive(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setImmersive(r2)
            return
    }

    public void setInheritShowWhenLocked(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.s0.a(r0, r2)
            return
    }

    public void setIntent(android.content.Intent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setIntent(r2)
            return
    }

    public void setLocusContext(android.content.LocusId r2, android.os.Bundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.w0.a(r0, r2, r3)
            return
    }

    public void setPictureInPictureParams(android.app.PictureInPictureParams r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.h1.a(r0, r2)
            return
    }

    public void setRequestedOrientation(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setRequestedOrientation(r2)
            return
    }

    public void setShowWhenLocked(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.i1.a(r0, r2)
            return
    }

    public void setTaskDescription(android.app.ActivityManager.TaskDescription r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setTaskDescription(r2)
            return
    }

    public void setTheme(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setTheme(r2)
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setTitle(r2)
            return
    }

    public void setTitleColor(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setTitleColor(r2)
            return
    }

    public boolean setTranslucent(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.s1.a(r0, r2)
            return r2
    }

    public void setTurnScreenOn(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.j1.a(r0, r2)
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.setVisible(r2)
            return
    }

    public void setVrModeEnabled(boolean r2, android.content.ComponentName r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.d1.a(r0, r2, r3)
            return
    }

    @Override // com.bytedance.pangle.wrapper.j
    public void setWrapperActivityTheme(int r1) {
            r0 = this;
            super/*android.app.Activity*/.setTheme(r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.y0.a(r0, r2)
            return r2
    }

    public boolean shouldUpRecreateTask(android.content.Intent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.shouldUpRecreateTask(r2)
            return r2
    }

    public boolean showAssist(android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = com.bytedance.pangle.wrapper.q1.a(r0, r2)
            return r2
    }

    public void showLockTaskEscapeMessage() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.v1.a(r0)
            return
    }

    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = r0.startActionMode(r2)
            return r2
    }

    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            android.view.ActionMode r2 = com.bytedance.pangle.wrapper.d2.a(r0, r2, r3)
            return r2
    }

    public void startActivities(android.content.Intent[] r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivities(r2)
            return
    }

    public void startActivities(android.content.Intent[] r2, android.os.Bundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivities(r2, r3)
            return
    }

    public void startActivity(android.content.Intent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivity(r2)
            return
    }

    public void startActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivity(r2, r3)
            return
    }

    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityForResult(r2, r3)
            return
    }

    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityForResult(r2, r3, r4)
            return
    }

    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityFromChild(r2, r3, r4)
            return
    }

    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityFromChild(r2, r3, r4, r5)
            return
    }

    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityFromFragment(r2, r3, r4)
            return
    }

    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityFromFragment(r2, r3, r4, r5)
            return
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityFromFragment(r2, r3, r4)
            return
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startActivityFromFragment(r2, r3, r4, r5)
            return
    }

    public boolean startActivityIfNeeded(android.content.Intent r2, int r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.startActivityIfNeeded(r2, r3)
            return r2
    }

    public boolean startActivityIfNeeded(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.startActivityIfNeeded(r2, r3, r4)
            return r2
    }

    public void startIntentSender(android.content.IntentSender r7, android.content.Intent r8, int r9, int r10, int r11) throws android.content.IntentSender.SendIntentException {
            r6 = this;
            androidx.fragment.app.FragmentActivity r0 = r6.mOriginActivity
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.startIntentSender(r1, r2, r3, r4, r5)
            return
    }

    public void startIntentSender(android.content.IntentSender r8, android.content.Intent r9, int r10, int r11, int r12, android.os.Bundle r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            androidx.fragment.app.FragmentActivity r0 = r7.mOriginActivity
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.startIntentSender(r1, r2, r3, r4, r5, r6)
            return
    }

    public void startIntentSenderForResult(android.content.IntentSender r8, int r9, android.content.Intent r10, int r11, int r12, int r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            androidx.fragment.app.FragmentActivity r0 = r7.mOriginActivity
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    public void startIntentSenderForResult(android.content.IntentSender r9, int r10, android.content.Intent r11, int r12, int r13, int r14, android.os.Bundle r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            androidx.fragment.app.FragmentActivity r0 = r8.mOriginActivity
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

    public void startIntentSenderFromChild(android.app.Activity r9, android.content.IntentSender r10, int r11, android.content.Intent r12, int r13, int r14, int r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            androidx.fragment.app.FragmentActivity r0 = r8.mOriginActivity
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

    public void startIntentSenderFromChild(android.app.Activity r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            androidx.fragment.app.FragmentActivity r0 = r9.mOriginActivity
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

    public void startIntentSenderFromFragment(androidx.fragment.app.Fragment r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            androidx.fragment.app.FragmentActivity r0 = r9.mOriginActivity
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.startIntentSenderFromFragment(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void startLocalVoiceInteraction(android.os.Bundle r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.c2.a(r0, r2)
            return
    }

    public void startLockTask() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startLockTask()
            return
    }

    public void startManagingCursor(android.database.Cursor r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startManagingCursor(r2)
            return
    }

    public boolean startNextMatchingActivity(android.content.Intent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.startNextMatchingActivity(r2)
            return r2
    }

    public boolean startNextMatchingActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.startNextMatchingActivity(r2, r3)
            return r2
    }

    public void startPostponedEnterTransition() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startPostponedEnterTransition()
            return
    }

    public void startSearch(java.lang.String r2, boolean r3, android.os.Bundle r4, boolean r5) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.startSearch(r2, r3, r4, r5)
            return
    }

    public void stopLocalVoiceInteraction() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.f1.a(r0)
            return
    }

    public void stopLockTask() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.stopLockTask()
            return
    }

    public void stopManagingCursor(android.database.Cursor r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.stopManagingCursor(r2)
            return
    }

    public boolean superDispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            boolean r2 = r0.superDispatchKeyEvent(r2)
            return r2
    }

    public void supportFinishAfterTransition() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.supportFinishAfterTransition()
            return
    }

    public void supportInvalidateOptionsMenu() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.supportInvalidateOptionsMenu()
            return
    }

    public void supportPostponeEnterTransition() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.supportPostponeEnterTransition()
            return
    }

    public void supportStartPostponedEnterTransition() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.supportStartPostponedEnterTransition()
            return
    }

    public void takeKeyEvents(boolean r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.takeKeyEvents(r2)
            return
    }

    public void triggerSearch(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.triggerSearch(r2, r3)
            return
    }

    public void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            com.bytedance.pangle.wrapper.n1.a(r0, r2)
            return
    }

    public void unregisterForContextMenu(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.mOriginActivity
            r0.unregisterForContextMenu(r2)
            return
    }
}
