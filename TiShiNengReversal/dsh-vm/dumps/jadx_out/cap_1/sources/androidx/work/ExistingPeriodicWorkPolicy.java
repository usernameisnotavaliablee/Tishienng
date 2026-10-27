package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public enum ExistingPeriodicWorkPolicy extends java.lang.Enum<androidx.work.ExistingPeriodicWorkPolicy> {
    private static final /* synthetic */ androidx.work.ExistingPeriodicWorkPolicy[] $VALUES = null;
    public static final androidx.work.ExistingPeriodicWorkPolicy KEEP = null;
    public static final androidx.work.ExistingPeriodicWorkPolicy REPLACE = null;

    static {
            androidx.work.ExistingPeriodicWorkPolicy r0 = new androidx.work.ExistingPeriodicWorkPolicy
            java.lang.String r1 = "REPLACE"
            r2 = 0
            r0.<init>(r1, r2)
            androidx.work.ExistingPeriodicWorkPolicy.REPLACE = r0
            androidx.work.ExistingPeriodicWorkPolicy r1 = new androidx.work.ExistingPeriodicWorkPolicy
            java.lang.String r3 = "KEEP"
            r4 = 1
            r1.<init>(r3, r4)
            androidx.work.ExistingPeriodicWorkPolicy.KEEP = r1
            r3 = 2
            androidx.work.ExistingPeriodicWorkPolicy[] r3 = new androidx.work.ExistingPeriodicWorkPolicy[r3]
            r3[r2] = r0
            r3[r4] = r1
            androidx.work.ExistingPeriodicWorkPolicy.$VALUES = r3
            return
    }

    ExistingPeriodicWorkPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static androidx.work.ExistingPeriodicWorkPolicy valueOf(java.lang.String r1) {
            java.lang.Class<androidx.work.ExistingPeriodicWorkPolicy> r0 = androidx.work.ExistingPeriodicWorkPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.work.ExistingPeriodicWorkPolicy r1 = (androidx.work.ExistingPeriodicWorkPolicy) r1
            return r1
    }

    public static androidx.work.ExistingPeriodicWorkPolicy[] values() {
            androidx.work.ExistingPeriodicWorkPolicy[] r0 = androidx.work.ExistingPeriodicWorkPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.work.ExistingPeriodicWorkPolicy[] r0 = (androidx.work.ExistingPeriodicWorkPolicy[]) r0
            return r0
    }
}
