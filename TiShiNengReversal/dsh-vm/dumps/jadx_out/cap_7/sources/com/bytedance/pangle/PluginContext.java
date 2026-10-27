package com.bytedance.pangle;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class PluginContext extends com.bytedance.pangle.ae {
    private android.view.LayoutInflater mInflater;
    public boolean mIsHostApplicationContext;
    public android.content.Context mOriginContext;
    private android.content.res.Configuration mOverrideConfiguration;
    public com.bytedance.pangle.plugin.Plugin mPlugin;

    public PluginContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public PluginContext(android.content.Context r3, com.bytedance.pangle.plugin.Plugin r4, boolean r5) {
            r2 = this;
            android.content.Context r0 = getContextWithoutTheme(r3)
            int r1 = getThemeResourceId(r3)
            r2.<init>(r0, r1)
            r2.mPlugin = r4
            r2.mOriginContext = r3
            r2.mIsHostApplicationContext = r5
            return
    }

    public static android.content.Context getContextWithoutTheme(android.content.Context r1) {
            boolean r0 = r1 instanceof android.view.ContextThemeWrapper
            if (r0 == 0) goto Lf
            android.view.ContextThemeWrapper r1 = (android.view.ContextThemeWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.content.Context r1 = getContextWithoutTheme(r1)
            return r1
        Lf:
            boolean r0 = r1 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r0 == 0) goto L1d
            androidx.appcompat.view.ContextThemeWrapper r1 = (androidx.appcompat.view.ContextThemeWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.content.Context r1 = getContextWithoutTheme(r1)
        L1d:
            return r1
    }

    @androidx.annotation.RequiresApi(api = 17)
    private android.content.res.Resources getResourcesInternal() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            android.content.res.Resources r0 = r0.mResources
            return r0
    }

    public static int getThemeResourceId(android.content.Context r1) {
            boolean r0 = r1 instanceof android.view.ContextThemeWrapper
            if (r0 == 0) goto L15
            java.lang.String r0 = "mThemeResource"
            java.lang.Object r0 = com.bytedance.pangle.util.FieldUtils.readField(r1, r0)     // Catch: java.lang.IllegalAccessException -> L11
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.IllegalAccessException -> L11
            int r1 = r0.intValue()     // Catch: java.lang.IllegalAccessException -> L11
            return r1
        L11:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        L15:
            boolean r0 = r1 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r0 == 0) goto L20
            androidx.appcompat.view.ContextThemeWrapper r1 = (androidx.appcompat.view.ContextThemeWrapper) r1
            int r1 = r1.getThemeResId()
            return r1
        L20:
            r1 = 0
            return r1
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(android.content.res.Configuration r2) {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            android.content.res.Resources r0 = r0.mResources
            if (r0 != 0) goto L1a
            android.content.res.Configuration r0 = r1.mOverrideConfiguration
            if (r0 != 0) goto L12
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r2)
            r1.mOverrideConfiguration = r0
            return
        L12:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Override configuration has already been set"
            r2.<init>(r0)
            throw r2
        L1a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "getResources() or getAssets() has already been called"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context createConfigurationContext(android.content.res.Configuration r3) {
            r2 = this;
            java.lang.String r0 = "mResources"
            android.content.Context r3 = super.createConfigurationContext(r3)
            com.bytedance.pangle.plugin.Plugin r1 = r2.mPlugin     // Catch: java.lang.Throwable -> Le
            android.content.res.Resources r1 = r1.mResources     // Catch: java.lang.Throwable -> Le
            com.bytedance.pangle.util.FieldUtils.writeField(r3, r0, r1)     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Field r0 = com.bytedance.pangle.xt.xt.j.j(r1, r0)     // Catch: java.lang.Throwable -> L1e
            com.bytedance.pangle.plugin.Plugin r1 = r2.mPlugin     // Catch: java.lang.Throwable -> L1e
            android.content.res.Resources r1 = r1.mResources     // Catch: java.lang.Throwable -> L1e
            r0.set(r3, r1)     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        L22:
            return r3
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.Context getApplicationContext() {
            r2 = this;
            android.content.Context r0 = r2.mOriginContext
            boolean r1 = r0 instanceof com.bytedance.pangle.wrapper.PluginApplicationWrapper
            if (r1 == 0) goto L7
            return r0
        L7:
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.bytedance.pangle.plugin.Plugin r1 = r2.mPlugin
            java.lang.String r1 = r1.mPkgName
            android.content.Context r0 = com.bytedance.pangle.transform.ZeusTransformUtils.wrapperContext(r0, r1)
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.pm.ApplicationInfo getApplicationInfo() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            android.content.pm.ApplicationInfo r0 = r0.mHostApplicationInfoHookSomeField
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            android.content.res.Resources r0 = r0.mResources
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper
    public android.content.Context getBaseContext() {
            r2 = this;
            android.content.Context r0 = super.getBaseContext()
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto Le
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
        Le:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            com.bytedance.pangle.PluginClassLoader r0 = r0.mClassLoader
            return r0
    }

    public android.content.res.Configuration getOverrideConfiguration() {
            r1 = this;
            android.content.res.Configuration r0 = r1.mOverrideConfiguration
            return r0
    }

    public java.lang.String getPluginPackageName() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            java.lang.String r0 = r0.mPkgName
            return r0
    }

    @Override // com.bytedance.pangle.ae
    protected java.lang.String getPluginPkg() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            java.lang.String r0 = r0.mPkgName
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            com.bytedance.pangle.plugin.Plugin r0 = r1.mPlugin
            android.content.res.Resources r0 = r0.mResources
            return r0
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L20
            android.view.LayoutInflater r2 = r1.mInflater
            if (r2 != 0) goto L1d
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.mInflater = r2
            com.bytedance.pangle.res.xt.j(r2)
        L1d:
            android.view.LayoutInflater r2 = r1.mInflater
            return r2
        L20:
            android.content.Context r0 = r1.mOriginContext
            if (r0 == 0) goto L29
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
        L29:
            android.content.Context r0 = r1.getBaseContext()
            java.lang.Object r2 = r0.getSystemService(r2)
            return r2
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void registerComponentCallbacks(android.content.ComponentCallbacks r2) {
            r1 = this;
            boolean r0 = r1.mIsHostApplicationContext
            if (r0 == 0) goto La
            android.content.Context r0 = r1.mOriginContext
            r0.registerComponentCallbacks(r2)
            return
        La:
            super.registerComponentCallbacks(r2)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterComponentCallbacks(android.content.ComponentCallbacks r2) {
            r1 = this;
            boolean r0 = r1.mIsHostApplicationContext
            if (r0 == 0) goto La
            android.content.Context r0 = r1.mOriginContext
            r0.unregisterComponentCallbacks(r2)
            return
        La:
            super.unregisterComponentCallbacks(r2)
            return
    }
}
