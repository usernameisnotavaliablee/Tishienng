package xyz.adscope.common.json.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class TypeUtil {
    public TypeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isBasicType(java.lang.Class<?> r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L14
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            boolean r1 = isWrapType(r1)
            return r1
        L14:
            r1 = 1
            return r1
    }

    public static boolean isWrapType(java.lang.Class<?> r2) {
            r0 = 0
            java.lang.String r1 = "TYPE"
            java.lang.reflect.Field r2 = r2.getField(r1)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L16
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Exception -> L16
            boolean r2 = r2.isPrimitive()     // Catch: java.lang.Exception -> L16
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            return r0
    }
}
