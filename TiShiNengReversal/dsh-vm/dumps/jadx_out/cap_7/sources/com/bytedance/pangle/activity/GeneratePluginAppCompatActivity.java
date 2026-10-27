package com.bytedance.pangle.activity;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class GeneratePluginAppCompatActivity extends androidx.appcompat.app.AppCompatActivity implements com.bytedance.pangle.activity.IPluginActivity {
    boolean hasInit;
    public com.bytedance.pangle.plugin.Plugin mPlugin;
    public com.bytedance.pangle.activity.GenerateProxyAppCompatActivity mProxyActivity;

    public GeneratePluginAppCompatActivity() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.hasInit = r0
            return
    }

    @Override // com.bytedance.pangle.activity.IPluginActivity
    public void _requestPermissions(java.lang.String[] r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            com.bytedance.pangle.activity.b.a(r0, r2, r3)
            return
    }

    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperAddContentView(r2, r3)
            return
    }

    @Override // com.bytedance.pangle.activity.IPluginActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r1 = r0.mProxyActivity
            com.bytedance.pangle.util.j.j(r0, r1)
            return
    }

    public void closeContextMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperCloseContextMenu()
            return
    }

    public void closeOptionsMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperCloseOptionsMenu()
            return
    }

    public boolean convertToTranslucent(android.app.Activity.TranslucentConversionListener r2, android.app.ActivityOptions r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperConvertToTranslucent(r2, r3)
            return r2
    }

    public android.app.PendingIntent createPendingResult(int r2, android.content.Intent r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.app.PendingIntent r2 = r0.zeusSuperCreatePendingResult(r2, r3, r4)
            return r2
    }

    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperDispatchGenericMotionEvent(r2)
            return r2
    }

    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperDispatchKeyEvent(r2)
            return r2
    }

    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperDispatchKeyShortcutEvent(r2)
            return r2
    }

    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperDispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperDispatchTouchEvent(r2)
            return r2
    }

    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperDispatchTrackballEvent(r2)
            return r2
    }

    public void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperDump(r2, r3, r4, r5)
            return
    }

    public void enterPictureInPictureMode() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperEnterPictureInPictureMode()
            return
    }

    public boolean enterPictureInPictureMode(android.app.PictureInPictureParams r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperEnterPictureInPictureMode(r2)
            return r2
    }

    public android.view.View findViewById(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.View r2 = r0.zeusSuperFindViewById(r2)
            return r2
    }

    public void finish() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperFinish()
            return
    }

    public void finishActivity(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperFinishActivity(r2)
            return
    }

    public void finishActivityFromChild(android.app.Activity r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperFinishActivityFromChild(r2, r3)
            return
    }

    public void finishAffinity() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperFinishAffinity()
            return
    }

    public void finishAfterTransition() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperFinishAfterTransition()
            return
    }

    public void finishAndRemoveTask() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperFinishAndRemoveTask()
            return
    }

    public void finishFromChild(android.app.Activity r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperFinishFromChild(r2)
            return
    }

    public android.app.ActionBar getActionBar() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.app.ActionBar r0 = r0.zeusSuperGetActionBar()
            return r0
    }

    public android.content.ComponentName getCallingActivity() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.content.ComponentName r0 = r0.zeusSuperGetCallingActivity()
            return r0
    }

    public java.lang.String getCallingPackage() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            java.lang.String r0 = r0.zeusSuperGetCallingPackage()
            return r0
    }

    public int getChangingConfigurations() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            int r0 = r0.zeusSuperGetChangingConfigurations()
            return r0
    }

    public android.content.ComponentName getComponentName() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.content.ComponentName r0 = r0.zeusSuperGetComponentName()
            return r0
    }

    public android.transition.Scene getContentScene() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.transition.Scene r0 = r0.zeusSuperGetContentScene()
            return r0
    }

    public android.transition.TransitionManager getContentTransitionManager() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.transition.TransitionManager r0 = r0.zeusSuperGetContentTransitionManager()
            return r0
    }

    public android.view.View getCurrentFocus() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.View r0 = r0.zeusSuperGetCurrentFocus()
            return r0
    }

    public android.app.FragmentManager getFragmentManager() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.app.FragmentManager r0 = r0.zeusSuperGetFragmentManager()
            return r0
    }

    public android.content.Intent getIntent() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.content.Intent r0 = r0.zeusSuperGetIntent()
            return r0
    }

    public java.lang.Object getLastNonConfigurationInstance() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            java.lang.Object r0 = r0.zeusSuperGetLastNonConfigurationInstance()
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.LayoutInflater r0 = r0.zeusSuperGetLayoutInflater()
            return r0
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r3 = this;
            boolean r0 = r3.hasInit
            if (r0 != 0) goto L1b
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<androidx.lifecycle.LifecycleRegistry> r1 = androidx.lifecycle.LifecycleRegistry.class
            java.lang.String r2 = "mEnforceMainThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1a
            r1.set(r0, r2)     // Catch: java.lang.Throwable -> L1a
        L1a:
            return r0
        L1b:
            androidx.lifecycle.Lifecycle r0 = super/*androidx.activity.ComponentActivity*/.getLifecycle()
            return r0
    }

    public android.app.LoaderManager getLoaderManager() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.app.LoaderManager r0 = r0.zeusSuperGetLoaderManager()
            return r0
    }

    public java.lang.String getLocalClassName() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            java.lang.String r0 = r0.zeusSuperGetLocalClassName()
            return r0
    }

    public int getMaxNumPictureInPictureActions() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            int r0 = r0.zeusSuperGetMaxNumPictureInPictureActions()
            return r0
    }

    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.MenuInflater r0 = r0.zeusSuperGetMenuInflater()
            return r0
    }

    public android.content.Intent getParentActivityIntent() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.content.Intent r0 = r0.zeusSuperGetParentActivityIntent()
            return r0
    }

    public android.content.SharedPreferences getPreferences(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.content.SharedPreferences r2 = r0.zeusSuperGetPreferences(r2)
            return r2
    }

    public android.net.Uri getReferrer() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.net.Uri r0 = r0.zeusSuperGetReferrer()
            return r0
    }

    public int getRequestedOrientation() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            int r0 = r0.zeusSuperGetRequestedOrientation()
            return r0
    }

    public androidx.appcompat.app.ActionBar getSupportActionBar() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            androidx.appcompat.app.ActionBar r0 = r0.zeusSuperGetSupportActionBar()
            return r0
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            androidx.fragment.app.FragmentManager r0 = r0.zeusSuperGetSupportFragmentManager()
            return r0
    }

    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            java.lang.Object r2 = r0.zeusSuperGetSystemService(r2)
            return r2
    }

    public int getTaskId() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            int r0 = r0.zeusSuperGetTaskId()
            return r0
    }

    public android.app.VoiceInteractor getVoiceInteractor() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.app.VoiceInteractor r0 = r0.zeusSuperGetVoiceInteractor()
            return r0
    }

    public android.view.Window getWindow() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.Window r0 = r0.zeusSuperGetWindow()
            return r0
    }

    public android.view.WindowManager getWindowManager() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.WindowManager r0 = r0.zeusSuperGetWindowManager()
            return r0
    }

    public boolean hasWindowFocus() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperHasWindowFocus()
            return r0
    }

    public void invalidateOptionsMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperInvalidateOptionsMenu()
            return
    }

    public boolean isActivityTransitionRunning() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsActivityTransitionRunning()
            return r0
    }

    public boolean isChangingConfigurations() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsChangingConfigurations()
            return r0
    }

    public boolean isDestroyed() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsDestroyed()
            return r0
    }

    public boolean isFinishing() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsFinishing()
            return r0
    }

    public boolean isImmersive() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsImmersive()
            return r0
    }

    public boolean isInMultiWindowMode() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsInMultiWindowMode()
            return r0
    }

    public boolean isInPictureInPictureMode() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsInPictureInPictureMode()
            return r0
    }

    public boolean isLocalVoiceInteractionSupported() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsLocalVoiceInteractionSupported()
            return r0
    }

    public boolean isTaskRoot() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsTaskRoot()
            return r0
    }

    public boolean isVoiceInteraction() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsVoiceInteraction()
            return r0
    }

    public boolean isVoiceInteractionRoot() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperIsVoiceInteractionRoot()
            return r0
    }

    public boolean moveTaskToBack(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperMoveTaskToBack(r2)
            return r2
    }

    public boolean navigateUpTo(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperNavigateUpTo(r2)
            return r2
    }

    public boolean navigateUpToFromChild(android.app.Activity r2, android.content.Intent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperNavigateUpToFromChild(r2, r3)
            return r2
    }

    public void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnActionModeFinished(r2)
            return
    }

    public void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnActionModeStarted(r2)
            return
    }

    public void onActivityReenter(int r2, android.content.Intent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnActivityReenter(r2, r3)
            return
    }

    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnActivityResult(r2, r3, r4)
            return
    }

    protected void onApplyThemeResource(android.content.res.Resources.Theme r2, int r3, boolean r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnApplyThemeResource(r2, r3, r4)
            return
    }

    public void onAttachFragment(android.app.Fragment r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnAttachFragment(r2)
            return
    }

    public void onAttachedToWindow() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnAttachedToWindow()
            return
    }

    public void onBackPressed() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnBackPressed()
            return
    }

    protected void onChildTitleChanged(android.app.Activity r2, java.lang.CharSequence r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnChildTitleChanged(r2, r3)
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnConfigurationChanged(r2)
            return
    }

    public void onContentChanged() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnContentChanged()
            return
    }

    public boolean onContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnContextItemSelected(r2)
            return r2
    }

    public void onContextMenuClosed(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnContextMenuClosed(r2)
            return
    }

    @Override // com.bytedance.pangle.activity.IPluginActivity
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnCreate(r2)
            android.view.LayoutInflater r2 = r1.getLayoutInflater()
            com.bytedance.pangle.res.xt.j(r2)
            return
    }

    public void onCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnCreate(r2, r3)
            return
    }

    public void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnCreateContextMenu(r2, r3, r4)
            return
    }

    public java.lang.CharSequence onCreateDescription() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            java.lang.CharSequence r0 = r0.zeusSuperOnCreateDescription()
            return r0
    }

    protected android.app.Dialog onCreateDialog(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.app.Dialog r2 = r0.zeusSuperOnCreateDialog(r2)
            return r2
    }

    protected android.app.Dialog onCreateDialog(int r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.app.Dialog r2 = r0.zeusSuperOnCreateDialog(r2, r3)
            return r2
    }

    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnCreateNavigateUpTaskStack(r2)
            return
    }

    public boolean onCreateOptionsMenu(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnCreateOptionsMenu(r2)
            return r2
    }

    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnCreatePanelMenu(r2, r3)
            return r2
    }

    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.View r2 = r0.zeusSuperOnCreatePanelView(r2)
            return r2
    }

    public boolean onCreateThumbnail(android.graphics.Bitmap r2, android.graphics.Canvas r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnCreateThumbnail(r2, r3)
            return r2
    }

    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.View r2 = r0.zeusSuperOnCreateView(r2, r3, r4, r5)
            return r2
    }

    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.View r2 = r0.zeusSuperOnCreateView(r2, r3, r4)
            return r2
    }

    protected void onDestroy() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnDestroy()
            return
    }

    public void onDetachedFromWindow() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnDetachedFromWindow()
            return
    }

    public void onEnterAnimationComplete() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnEnterAnimationComplete()
            return
    }

    public boolean onGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnGenericMotionEvent(r2)
            return r2
    }

    public void onGetDirectActions(android.os.CancellationSignal r2, java.util.function.Consumer r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnGetDirectActions(r2, r3)
            return
    }

    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnKeyDown(r2, r3)
            return r2
    }

    public boolean onKeyLongPress(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnKeyLongPress(r2, r3)
            return r2
    }

    public boolean onKeyMultiple(int r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnKeyMultiple(r2, r3, r4)
            return r2
    }

    public boolean onKeyShortcut(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnKeyShortcut(r2, r3)
            return r2
    }

    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnKeyUp(r2, r3)
            return r2
    }

    public void onLocalVoiceInteractionStarted() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnLocalVoiceInteractionStarted()
            return
    }

    public void onLocalVoiceInteractionStopped() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnLocalVoiceInteractionStopped()
            return
    }

    public void onLowMemory() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnLowMemory()
            return
    }

    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnMenuOpened(r2, r3)
            return r2
    }

    public void onMultiWindowModeChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnMultiWindowModeChanged(r2)
            return
    }

    public void onMultiWindowModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnMultiWindowModeChanged(r2, r3)
            return
    }

    public boolean onNavigateUp() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperOnNavigateUp()
            return r0
    }

    public boolean onNavigateUpFromChild(android.app.Activity r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnNavigateUpFromChild(r2)
            return r2
    }

    protected void onNewIntent(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnNewIntent(r2)
            return
    }

    public boolean onOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnOptionsItemSelected(r2)
            return r2
    }

    public void onOptionsMenuClosed(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnOptionsMenuClosed(r2)
            return
    }

    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPanelClosed(r2, r3)
            return
    }

    protected void onPause() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPause()
            return
    }

    public void onPerformDirectAction(java.lang.String r2, android.os.Bundle r3, android.os.CancellationSignal r4, java.util.function.Consumer r5) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPerformDirectAction(r2, r3, r4, r5)
            return
    }

    public void onPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPictureInPictureModeChanged(r2)
            return
    }

    public void onPictureInPictureModeChanged(boolean r2, android.content.res.Configuration r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPictureInPictureModeChanged(r2, r3)
            return
    }

    public boolean onPictureInPictureRequested() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperOnPictureInPictureRequested()
            return r0
    }

    protected void onPostCreate(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPostCreate(r2)
            return
    }

    public void onPostCreate(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPostCreate(r2, r3)
            return
    }

    protected void onPostResume() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPostResume()
            return
    }

    protected void onPrepareDialog(int r2, android.app.Dialog r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPrepareDialog(r2, r3)
            return
    }

    protected void onPrepareDialog(int r2, android.app.Dialog r3, android.os.Bundle r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPrepareDialog(r2, r3, r4)
            return
    }

    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnPrepareNavigateUpTaskStack(r2)
            return
    }

    public boolean onPrepareOptionsMenu(android.view.Menu r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnPrepareOptionsMenu(r2)
            return r2
    }

    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnPreparePanel(r2, r3, r4)
            return r2
    }

    public void onProvideAssistContent(android.app.assist.AssistContent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnProvideAssistContent(r2)
            return
    }

    public void onProvideAssistData(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnProvideAssistData(r2)
            return
    }

    public void onProvideKeyboardShortcuts(java.util.List r2, android.view.Menu r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnProvideKeyboardShortcuts(r2, r3, r4)
            return
    }

    public android.net.Uri onProvideReferrer() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.net.Uri r0 = r0.zeusSuperOnProvideReferrer()
            return r0
    }

    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.stub.StubApp.interface22(r2, r3, r4)
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnRequestPermissionsResult(r2, r3, r4)
            return
    }

    protected void onRestart() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnRestart()
            return
    }

    protected void onRestoreInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity     // Catch: java.lang.Throwable -> L5
            r0.zeusSuperOnRestoreInstanceState(r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void onRestoreInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity     // Catch: java.lang.Throwable -> L5
            r0.zeusSuperOnRestoreInstanceState(r2, r3)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    protected void onResume() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnResume()
            return
    }

    protected void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnSaveInstanceState(r2)
            return
    }

    public void onSaveInstanceState(android.os.Bundle r2, android.os.PersistableBundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnSaveInstanceState(r2, r3)
            return
    }

    public boolean onSearchRequested() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperOnSearchRequested()
            return r0
    }

    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnSearchRequested(r2)
            return r2
    }

    protected void onStart() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnStart()
            return
    }

    public void onStateNotSaved() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnStateNotSaved()
            return
    }

    protected void onStop() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnStop()
            return
    }

    protected void onTitleChanged(java.lang.CharSequence r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnTitleChanged(r2, r3)
            return
    }

    public void onTopResumedActivityChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnTopResumedActivityChanged(r2)
            return
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnTouchEvent(r2)
            return r2
    }

    public boolean onTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperOnTrackballEvent(r2)
            return r2
    }

    public void onTrimMemory(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnTrimMemory(r2)
            return
    }

    public void onUserInteraction() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnUserInteraction()
            return
    }

    protected void onUserLeaveHint() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnUserLeaveHint()
            return
    }

    public void onVisibleBehindCanceled() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnVisibleBehindCanceled()
            return
    }

    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnWindowAttributesChanged(r2)
            return
    }

    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOnWindowFocusChanged(r2)
            return
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.ActionMode r2 = r0.zeusSuperOnWindowStartingActionMode(r2)
            return r2
    }

    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.ActionMode r2 = r0.zeusSuperOnWindowStartingActionMode(r2, r3)
            return r2
    }

    public void openContextMenu(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOpenContextMenu(r2)
            return
    }

    public void openOptionsMenu() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOpenOptionsMenu()
            return
    }

    public void overridePendingTransition(int r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperOverridePendingTransition(r2, r3)
            return
    }

    public void postponeEnterTransition() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperPostponeEnterTransition()
            return
    }

    public void recreate() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperRecreate()
            return
    }

    public void registerActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperRegisterActivityLifecycleCallbacks(r2)
            return
    }

    public void registerForContextMenu(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperRegisterForContextMenu(r2)
            return
    }

    public boolean releaseInstance() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r0 = r0.zeusSuperReleaseInstance()
            return r0
    }

    public void reportFullyDrawn() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperReportFullyDrawn()
            return
    }

    public android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.DragAndDropPermissions r2 = r0.zeusSuperRequestDragAndDropPermissions(r2)
            return r2
    }

    public boolean requestVisibleBehind(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperRequestVisibleBehind(r2)
            return r2
    }

    public void setActionBar(android.widget.Toolbar r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetActionBar(r2)
            return
    }

    public void setContentTransitionManager(android.transition.TransitionManager r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetContentTransitionManager(r2)
            return
    }

    public void setContentView(int r2) {
            r1 = this;
            com.bytedance.pangle.transform.ZeusTransformUtils.clearConstructorCache()
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetContentView(r2)
            com.bytedance.pangle.transform.ZeusTransformUtils.clearConstructorCache()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r1.findViewById(r2)
            com.bytedance.pangle.activity.cw.j(r1, r2)
            return
    }

    public void setContentView(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetContentView(r2)
            return
    }

    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetContentView(r2, r3)
            return
    }

    public void setEnterSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetEnterSharedElementCallback(r2)
            return
    }

    public void setExitSharedElementCallback(android.app.SharedElementCallback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetExitSharedElementCallback(r2)
            return
    }

    public void setFinishOnTouchOutside(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetFinishOnTouchOutside(r2)
            return
    }

    public void setImmersive(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetImmersive(r2)
            return
    }

    public void setInheritShowWhenLocked(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetInheritShowWhenLocked(r2)
            return
    }

    public void setIntent(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetIntent(r2)
            return
    }

    public void setLocusContext(android.content.LocusId r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetLocusContext(r2, r3)
            return
    }

    public void setPictureInPictureParams(android.app.PictureInPictureParams r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetPictureInPictureParams(r2)
            return
    }

    @Override // com.bytedance.pangle.activity.IPluginActivity
    public void setPluginProxyActivity(com.bytedance.pangle.activity.xt r1, com.bytedance.pangle.plugin.Plugin r2) {
            r0 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r1 = (com.bytedance.pangle.activity.GenerateProxyAppCompatActivity) r1
            r0.mProxyActivity = r1
            r0.mPlugin = r2
            return
    }

    @Override // com.bytedance.pangle.activity.IPluginActivity
    public void setProxyTheme2Plugin(int r1) {
            r0 = this;
            super.setTheme(r1)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    public void setRequestedOrientation(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetRequestedOrientation(r2)
            return
    }

    public void setShowWhenLocked(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetShowWhenLocked(r2)
            return
    }

    public void setTaskDescription(android.app.ActivityManager.TaskDescription r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetTaskDescription(r2)
            return
    }

    public void setTheme(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetTheme(r2)
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetTitle(r2)
            return
    }

    public void setTitleColor(int r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetTitleColor(r2)
            return
    }

    public boolean setTranslucent(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperSetTranslucent(r2)
            return r2
    }

    public void setTurnScreenOn(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetTurnScreenOn(r2)
            return
    }

    public void setVisible(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetVisible(r2)
            return
    }

    public void setVrModeEnabled(boolean r2, android.content.ComponentName r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperSetVrModeEnabled(r2, r3)
            return
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperShouldShowRequestPermissionRationale(r2)
            return r2
    }

    public boolean shouldUpRecreateTask(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperShouldUpRecreateTask(r2)
            return r2
    }

    public boolean showAssist(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperShowAssist(r2)
            return r2
    }

    public void showLockTaskEscapeMessage() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperShowLockTaskEscapeMessage()
            return
    }

    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.ActionMode r2 = r0.zeusSuperStartActionMode(r2)
            return r2
    }

    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            android.view.ActionMode r2 = r0.zeusSuperStartActionMode(r2, r3)
            return r2
    }

    public void startActivities(android.content.Intent[] r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivities(r2)
            return
    }

    public void startActivities(android.content.Intent[] r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivities(r2, r3)
            return
    }

    public void startActivity(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivity(r2)
            return
    }

    public void startActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivity(r2, r3)
            return
    }

    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivityForResult(r2, r3)
            return
    }

    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivityForResult(r2, r3, r4)
            return
    }

    public void startActivityForResult(java.lang.String r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.startActivityForResult(r2, r3, r4, r5)
            return
    }

    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivityFromChild(r2, r3, r4)
            return
    }

    public void startActivityFromChild(android.app.Activity r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivityFromChild(r2, r3, r4, r5)
            return
    }

    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivityFromFragment(r2, r3, r4)
            return
    }

    public void startActivityFromFragment(android.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartActivityFromFragment(r2, r3, r4, r5)
            return
    }

    public boolean startActivityIfNeeded(android.content.Intent r2, int r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperStartActivityIfNeeded(r2, r3)
            return r2
    }

    public boolean startActivityIfNeeded(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperStartActivityIfNeeded(r2, r3, r4)
            return r2
    }

    public void startIntentSender(android.content.IntentSender r7, android.content.Intent r8, int r9, int r10, int r11) throws android.content.IntentSender.SendIntentException {
            r6 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r6.mProxyActivity
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.zeusSuperStartIntentSender(r1, r2, r3, r4, r5)
            return
    }

    public void startIntentSender(android.content.IntentSender r8, android.content.Intent r9, int r10, int r11, int r12, android.os.Bundle r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r7.mProxyActivity
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.zeusSuperStartIntentSender(r1, r2, r3, r4, r5, r6)
            return
    }

    public void startIntentSenderForResult(android.content.IntentSender r8, int r9, android.content.Intent r10, int r11, int r12, int r13) throws android.content.IntentSender.SendIntentException {
            r7 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r7.mProxyActivity
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.zeusSuperStartIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    public void startIntentSenderForResult(android.content.IntentSender r9, int r10, android.content.Intent r11, int r12, int r13, int r14, android.os.Bundle r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r8.mProxyActivity
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.zeusSuperStartIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void startIntentSenderFromChild(android.app.Activity r9, android.content.IntentSender r10, int r11, android.content.Intent r12, int r13, int r14, int r15) throws android.content.IntentSender.SendIntentException {
            r8 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r8.mProxyActivity
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.zeusSuperStartIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void startIntentSenderFromChild(android.app.Activity r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r9.mProxyActivity
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.zeusSuperStartIntentSenderFromChild(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void startLocalVoiceInteraction(android.os.Bundle r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartLocalVoiceInteraction(r2)
            return
    }

    public void startLockTask() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartLockTask()
            return
    }

    public void startManagingCursor(android.database.Cursor r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartManagingCursor(r2)
            return
    }

    public boolean startNextMatchingActivity(android.content.Intent r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperStartNextMatchingActivity(r2)
            return r2
    }

    public boolean startNextMatchingActivity(android.content.Intent r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            boolean r2 = r0.zeusSuperStartNextMatchingActivity(r2, r3)
            return r2
    }

    public void startPostponedEnterTransition() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartPostponedEnterTransition()
            return
    }

    public void startSearch(java.lang.String r2, boolean r3, android.os.Bundle r4, boolean r5) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStartSearch(r2, r3, r4, r5)
            return
    }

    public void stopLocalVoiceInteraction() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStopLocalVoiceInteraction()
            return
    }

    public void stopLockTask() {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStopLockTask()
            return
    }

    public void stopManagingCursor(android.database.Cursor r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperStopManagingCursor(r2)
            return
    }

    public void takeKeyEvents(boolean r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperTakeKeyEvents(r2)
            return
    }

    public void triggerSearch(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperTriggerSearch(r2, r3)
            return
    }

    public void unregisterActivityLifecycleCallbacks(android.app.Application.ActivityLifecycleCallbacks r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperUnregisterActivityLifecycleCallbacks(r2)
            return
    }

    public void unregisterForContextMenu(android.view.View r2) {
            r1 = this;
            com.bytedance.pangle.activity.GenerateProxyAppCompatActivity r0 = r1.mProxyActivity
            r0.zeusSuperUnregisterForContextMenu(r2)
            return
    }
}
