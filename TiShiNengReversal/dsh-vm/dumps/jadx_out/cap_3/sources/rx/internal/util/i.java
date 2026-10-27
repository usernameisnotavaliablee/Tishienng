package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class i {
    public static final int a = 0;
    private static final int b = 0;
    private static final boolean c = false;

    static {
            int r0 = c()
            rx.internal.util.i.b = r0
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            rx.internal.util.i.c = r0
            return
    }

    private i() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static int a() {
            int r0 = rx.internal.util.i.b
            return r0
    }

    public static boolean b() {
            boolean r0 = rx.internal.util.i.c
            return r0
    }

    private static int c() {
            java.lang.String r0 = "android.os.Build$VERSION"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L18
            java.lang.String r1 = "SDK_INT"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L18
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L18
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L18
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L18
            return r0
        L18:
            r0 = 0
            return r0
    }
}
