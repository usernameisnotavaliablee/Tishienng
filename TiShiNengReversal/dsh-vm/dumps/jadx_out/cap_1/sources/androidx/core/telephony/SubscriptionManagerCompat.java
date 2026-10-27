package androidx.core.telephony;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(22)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SubscriptionManagerCompat {
    private static java.lang.reflect.Method sGetSlotIndexMethod;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static int getSlotIndex(int r0) {
                int r0 = android.telephony.SubscriptionManager.getSlotIndex(r0)
                return r0
        }
    }

    private SubscriptionManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSlotIndex(int r7) {
            r0 = -1
            if (r7 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lf
            int r7 = androidx.core.telephony.SubscriptionManagerCompat.Api29Impl.getSlotIndex(r7)
            return r7
        Lf:
            java.lang.reflect.Method r2 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L59
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L41
            r2 = 26
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r1 < r2) goto L2c
            java.lang.Class r1 = androidx.core.content.a.a()     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            java.lang.String r2 = "getSlotIndex"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            r6[r3] = r5     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r6)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            goto L3c
        L2c:
            java.lang.Class r1 = androidx.core.content.a.a()     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            java.lang.String r2 = "getSlotId"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            r6[r3] = r5     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r6)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
        L3c:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
        L41:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            r2[r3] = r7     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            r7 = 0
            java.lang.Object r7 = r1.invoke(r7, r2)     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            if (r7 == 0) goto L59
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L59 java.lang.Throwable -> L59 java.lang.Throwable -> L59
            return r7
        L59:
            return r0
    }
}
