package com.google.common.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class HostSpecifier {
    private final java.lang.String canonicalForm;

    private HostSpecifier(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.canonicalForm = r1
            return
    }

    public static com.google.common.net.HostSpecifier from(java.lang.String r4) throws java.text.ParseException {
            com.google.common.net.HostSpecifier r4 = fromValid(r4)     // Catch: java.lang.IllegalArgumentException -> L5
            return r4
        L5:
            r0 = move-exception
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid host specifier: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r2 = 0
            r1.<init>(r4, r2)
            r1.initCause(r0)
            throw r1
    }

    public static com.google.common.net.HostSpecifier fromValid(java.lang.String r3) {
            com.google.common.net.HostAndPort r3 = com.google.common.net.HostAndPort.fromString(r3)
            boolean r0 = r3.hasPort()
            r0 = r0 ^ 1
            com.google.common.base.Preconditions.checkArgument(r0)
            java.lang.String r3 = r3.getHost()
            java.net.InetAddress r0 = com.google.common.net.InetAddresses.forString(r3)     // Catch: java.lang.IllegalArgumentException -> L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L23
            com.google.common.net.HostSpecifier r3 = new com.google.common.net.HostSpecifier
            java.lang.String r0 = com.google.common.net.InetAddresses.toUriString(r0)
            r3.<init>(r0)
            return r3
        L23:
            com.google.common.net.InternetDomainName r0 = com.google.common.net.InternetDomainName.from(r3)
            boolean r1 = r0.hasPublicSuffix()
            if (r1 == 0) goto L37
            com.google.common.net.HostSpecifier r3 = new com.google.common.net.HostSpecifier
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            return r3
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Domain name does not have a recognized public suffix: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static boolean isValid(java.lang.String r0) {
            fromValid(r0)     // Catch: java.lang.IllegalArgumentException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.common.net.HostSpecifier
            if (r0 == 0) goto L13
            com.google.common.net.HostSpecifier r2 = (com.google.common.net.HostSpecifier) r2
            java.lang.String r0 = r1.canonicalForm
            java.lang.String r2 = r2.canonicalForm
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.canonicalForm
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.canonicalForm
            return r0
    }
}
