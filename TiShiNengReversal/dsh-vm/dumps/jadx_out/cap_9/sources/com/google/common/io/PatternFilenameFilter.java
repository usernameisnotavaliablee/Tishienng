package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class PatternFilenameFilter implements java.io.FilenameFilter {
    private final java.util.regex.Pattern pattern;

    public PatternFilenameFilter(java.lang.String r1) {
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r0.<init>(r1)
            return
    }

    public PatternFilenameFilter(java.util.regex.Pattern r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            r0.pattern = r1
            return
    }

    @Override // java.io.FilenameFilter
    public boolean accept(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.io.File r1, java.lang.String r2) {
            r0 = this;
            java.util.regex.Pattern r1 = r0.pattern
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            return r1
    }
}
