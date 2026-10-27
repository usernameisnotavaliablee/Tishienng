package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class OperationCanceledException extends java.lang.RuntimeException {
    public OperationCanceledException() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public OperationCanceledException(@androidx.annotation.Nullable java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "The operation has been canceled."
            java.lang.String r2 = androidx.core.util.ObjectsCompat.toString(r2, r0)
            r1.<init>(r2)
            return
    }
}
