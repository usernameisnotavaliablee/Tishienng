package com.umeng.socialize.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ResContainer {
    private static com.umeng.socialize.common.ResContainer R = null;
    private static java.lang.String mPackageName = "";
    private android.content.Context context;
    private java.util.Map<java.lang.String, com.umeng.socialize.common.ResContainer.SocializeResource> mResources;
    private java.util.Map<java.lang.String, java.lang.Integer> map;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SocializeResource {
        public int mId;
        public boolean mIsCompleted;
        public java.lang.String mName;
        public java.lang.String mType;

        public SocializeResource(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIsCompleted = r0
                r1.mType = r2
                r1.mName = r3
                return
        }
    }

    static {
            return
    }

    private ResContainer(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            r0 = 0
            r1.context = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.context = r2
            return
    }

    public ResContainer(android.content.Context r2, java.util.Map<java.lang.String, com.umeng.socialize.common.ResContainer.SocializeResource> r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            r1.mResources = r3
            r1.context = r2
            return
    }

    public static synchronized com.umeng.socialize.common.ResContainer get(android.content.Context r2) {
            java.lang.Class<com.umeng.socialize.common.ResContainer> r0 = com.umeng.socialize.common.ResContainer.class
            monitor-enter(r0)
            com.umeng.socialize.common.ResContainer r1 = com.umeng.socialize.common.ResContainer.R     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.umeng.socialize.common.ResContainer r1 = new com.umeng.socialize.common.ResContainer     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.umeng.socialize.common.ResContainer.R = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.umeng.socialize.common.ResContainer r2 = com.umeng.socialize.common.ResContainer.R     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public static int getResourceId(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r1 = com.umeng.socialize.common.ResContainer.mPackageName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L12
            java.lang.String r2 = r2.getPackageName()
            com.umeng.socialize.common.ResContainer.mPackageName = r2
        L12:
            java.lang.String r2 = com.umeng.socialize.common.ResContainer.mPackageName
            int r2 = r0.getIdentifier(r4, r3, r2)
            if (r2 <= 0) goto L1b
            return r2
        L1b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = com.umeng.socialize.common.ResContainer.mPackageName
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.resError(r0, r3, r4)
            java.lang.String r4 = com.umeng.socialize.utils.UrlUtil.ALL_NO_RES
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.errorWithUrl(r3, r4)
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.String getString(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "string"
            int r2 = getResourceId(r1, r0, r2)
            java.lang.String r1 = r1.getString(r2)
            return r1
    }

    public int anim(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "anim"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public synchronized java.util.Map<java.lang.String, com.umeng.socialize.common.ResContainer.SocializeResource> batch() {
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.String, com.umeng.socialize.common.ResContainer$SocializeResource> r0 = r5.mResources     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L33
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L33
            java.util.Map<java.lang.String, com.umeng.socialize.common.ResContainer$SocializeResource> r2 = r5.mResources     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L33
            com.umeng.socialize.common.ResContainer$SocializeResource r1 = (com.umeng.socialize.common.ResContainer.SocializeResource) r1     // Catch: java.lang.Throwable -> L33
            android.content.Context r2 = r5.context     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r1.mType     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = r1.mName     // Catch: java.lang.Throwable -> L33
            int r2 = getResourceId(r2, r3, r4)     // Catch: java.lang.Throwable -> L33
            r1.mId = r2     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r1.mIsCompleted = r2     // Catch: java.lang.Throwable -> L33
            goto Lf
        L33:
            r0 = move-exception
            goto L39
        L35:
            java.util.Map<java.lang.String, com.umeng.socialize.common.ResContainer$SocializeResource> r0 = r5.mResources     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
            return r0
        L39:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r0
    }

    public int color(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "color"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int dimen(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "dimen"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int drawable(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "drawable"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int id(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "id"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int layout(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "layout"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int raw(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "raw"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int string(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "string"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int style(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "style"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }

    public int styleable(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "styleable"
            int r3 = getResourceId(r0, r1, r3)
            return r3
    }
}
