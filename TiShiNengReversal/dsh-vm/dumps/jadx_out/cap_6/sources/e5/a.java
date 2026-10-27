package e5;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends org.junit.runners.Suite {
    public a(java.lang.Class<?> r2, org.junit.runners.model.f r3) throws java.lang.Throwable {
            r1 = this;
            java.lang.Class[] r0 = r2.getClasses()
            java.lang.Class[] r0 = J(r0)
            r1.<init>(r3, r2, r0)
            return
    }

    private static java.lang.Class<?>[] J(java.lang.Class<?>[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1c
            r3 = r5[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 != 0) goto L19
            r0.add(r3)
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            int r5 = r0.size()
            java.lang.Class[] r5 = new java.lang.Class[r5]
            java.lang.Object[] r5 = r0.toArray(r5)
            java.lang.Class[] r5 = (java.lang.Class[]) r5
            return r5
    }
}
