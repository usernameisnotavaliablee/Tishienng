package pl.droidsonroids.relinker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MissingLibraryException extends java.lang.RuntimeException {
    public MissingLibraryException(java.lang.String r3, java.lang.String[] r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not find '"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "'. Looked for: "
            r0.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r4)
            r0.append(r3)
            java.lang.String r3 = ", but only found: "
            r0.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r5)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
    }
}
