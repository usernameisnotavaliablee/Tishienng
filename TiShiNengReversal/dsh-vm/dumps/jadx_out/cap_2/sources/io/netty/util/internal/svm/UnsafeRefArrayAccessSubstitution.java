package io.netty.util.internal.svm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.oracle.svm.core.annotate.TargetClass(className = "io.netty.util.internal.shaded.org.jctools.util.UnsafeRefArrayAccess")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class UnsafeRefArrayAccessSubstitution {

    @com.oracle.svm.core.annotate.RecomputeFieldValue(declClass = java.lang.Object[].class, kind = com.oracle.svm.core.annotate.RecomputeFieldValue.Kind.ArrayIndexShift)
    @com.oracle.svm.core.annotate.Alias
    public static int REF_ELEMENT_SHIFT;

    private UnsafeRefArrayAccessSubstitution() {
            r0 = this;
            r0.<init>()
            return
    }
}
