package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DebugUtils {
    private DebugUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void buildShortClassTag(java.lang.Object r2, java.lang.StringBuilder r3) {
            if (r2 != 0) goto L8
            java.lang.String r2 = "null"
            r3.append(r2)
            return
        L8:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L2c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L2c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L2c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
            return
    }
}
