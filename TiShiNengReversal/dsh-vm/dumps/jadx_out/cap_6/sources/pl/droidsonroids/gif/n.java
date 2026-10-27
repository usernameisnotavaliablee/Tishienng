package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class n {
    private static final java.lang.String a = "pl_droidsonroids_gif";

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private static android.content.Context b;

    private n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(@androidx.annotation.NonNull android.content.Context r0) {
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            pl.droidsonroids.gif.n.b = r0
            return
    }

    static void b() {
            java.lang.String r0 = "pl_droidsonroids_gif"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L6
            return
        L6:
            android.content.Context r1 = getContext()
            pl.droidsonroids.relinker.c.b(r1, r0)
            return
    }

    private static android.content.Context getContext() {
            android.content.Context r0 = pl.droidsonroids.gif.n.b
            if (r0 != 0) goto L23
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1a
            java.lang.String r1 = "currentApplication"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Exception -> L1a
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Exception -> L1a
            pl.droidsonroids.gif.n.b = r0     // Catch: java.lang.Exception -> L1a
            goto L23
        L1a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes."
            r1.<init>(r2, r0)
            throw r1
        L23:
            android.content.Context r0 = pl.droidsonroids.gif.n.b
            return r0
    }
}
