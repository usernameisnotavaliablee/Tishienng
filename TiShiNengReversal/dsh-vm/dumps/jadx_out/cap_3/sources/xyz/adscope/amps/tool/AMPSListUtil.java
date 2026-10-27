package xyz.adscope.amps.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSListUtil {
    public AMPSListUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addDataToList(java.util.List r0, java.lang.Object r1) {
            if (r0 != 0) goto L3
            goto L8
        L3:
            if (r1 == 0) goto L8
            r0.add(r1)
        L8:
            return
    }

    public static void addDataToList(java.util.List r1, java.util.List r2) {
            if (r1 != 0) goto L3
            goto Le
        L3:
            if (r2 == 0) goto Le
            int r0 = r2.size()
            if (r0 <= 0) goto Le
            r1.addAll(r2)
        Le:
            return
    }
}
