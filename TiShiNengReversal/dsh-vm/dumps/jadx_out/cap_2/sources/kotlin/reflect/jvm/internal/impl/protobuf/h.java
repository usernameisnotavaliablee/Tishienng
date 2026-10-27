package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class h {
    public static final byte[] a = null;
    public static final java.nio.ByteBuffer b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        int getNumber();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b<T extends kotlin.reflect.jvm.internal.impl.protobuf.h.a> {
        T a(int r1);
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            kotlin.reflect.jvm.internal.impl.protobuf.h.a = r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            kotlin.reflect.jvm.internal.impl.protobuf.h.b = r0
            return
    }

    public static boolean a(byte[] r0) {
            boolean r0 = kotlin.reflect.jvm.internal.impl.protobuf.u.e(r0)
            return r0
    }

    public static java.lang.String b(byte[] r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L8
            java.lang.String r1 = "UTF-8"
            r0.<init>(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> L8
            return r0
        L8:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "UTF-8 not supported?"
            r0.<init>(r1, r2)
            throw r0
    }
}
