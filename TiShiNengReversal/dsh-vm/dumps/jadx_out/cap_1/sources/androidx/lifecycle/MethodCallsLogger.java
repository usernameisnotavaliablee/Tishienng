package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class MethodCallsLogger {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Integer> calledMethods;

    public MethodCallsLogger() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.calledMethods = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(@org.jetbrains.annotations.NotNull java.lang.String r5, int r6) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.calledMethods
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.intValue()
            goto L16
        L15:
            r0 = 0
        L16:
            r2 = r0 & r6
            r3 = 1
            if (r2 == 0) goto L1c
            r1 = 1
        L1c:
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r4.calledMethods
            r6 = r6 | r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.put(r5, r6)
            r5 = r1 ^ 1
            return r5
    }
}
