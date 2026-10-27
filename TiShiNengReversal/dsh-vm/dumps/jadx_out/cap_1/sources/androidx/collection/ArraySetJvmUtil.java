package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> T[] resizeForToArray(T[] r1, int r2) {
            int r0 = r1.length
            if (r0 >= r2) goto L12
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r1 = r1.getComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            return r1
        L12:
            int r0 = r1.length
            if (r0 <= r2) goto L18
            r0 = 0
            r1[r2] = r0
        L18:
            return r1
    }
}
