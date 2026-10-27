package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class InputMerger {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "InputMerger"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.InputMerger.TAG = r0
            return
    }

    public InputMerger() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static androidx.work.InputMerger fromClassName(java.lang.String r5) {
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> Lb
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> Lb
            androidx.work.InputMerger r0 = (androidx.work.InputMerger) r0     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r0 = move-exception
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.String r2 = androidx.work.InputMerger.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Trouble instantiating + "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r3 = 1
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r4 = 0
            r3[r4] = r0
            r1.error(r2, r5, r3)
            r5 = 0
            return r5
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.Data merge(@androidx.annotation.NonNull java.util.List<androidx.work.Data> r1);
}
