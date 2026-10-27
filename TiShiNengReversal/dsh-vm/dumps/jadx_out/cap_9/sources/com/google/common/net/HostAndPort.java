package com.google.common.net;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class HostAndPort implements java.io.Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final java.lang.String host;
    private final int port;

    private HostAndPort(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.host = r1
            r0.port = r2
            r0.hasBracketlessColons = r3
            return
    }

    public static com.google.common.net.HostAndPort fromHost(java.lang.String r3) {
            com.google.common.net.HostAndPort r0 = fromString(r3)
            boolean r1 = r0.hasPort()
            r1 = r1 ^ 1
            java.lang.String r2 = "Host has a port: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r3)
            return r0
    }

    public static com.google.common.net.HostAndPort fromParts(java.lang.String r3, int r4) {
            boolean r0 = isValidPort(r4)
            java.lang.String r1 = "Port out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r4)
            com.google.common.net.HostAndPort r0 = fromString(r3)
            boolean r1 = r0.hasPort()
            r1 = r1 ^ 1
            java.lang.String r2 = "Host has a port: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r3)
            com.google.common.net.HostAndPort r3 = new com.google.common.net.HostAndPort
            java.lang.String r1 = r0.host
            boolean r0 = r0.hasBracketlessColons
            r3.<init>(r1, r4, r0)
            return r3
    }

    public static com.google.common.net.HostAndPort fromString(java.lang.String r6) {
            com.google.common.base.Preconditions.checkNotNull(r6)
            java.lang.String r0 = "["
            boolean r0 = r6.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L17
            java.lang.String[] r0 = getHostAndPortFromBracketedHost(r6)
            r4 = r0[r3]
            r0 = r0[r2]
            goto L35
        L17:
            r0 = 58
            int r4 = r6.indexOf(r0)
            if (r4 < 0) goto L30
            int r5 = r4 + 1
            int r0 = r6.indexOf(r0, r5)
            if (r0 != r1) goto L30
            java.lang.String r4 = r6.substring(r3, r4)
            java.lang.String r0 = r6.substring(r5)
            goto L35
        L30:
            if (r4 < 0) goto L33
            r3 = 1
        L33:
            r0 = 0
            r4 = r6
        L35:
            boolean r5 = com.google.common.base.Strings.isNullOrEmpty(r0)
            if (r5 != 0) goto L6c
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            r1 = r1 ^ r2
            java.lang.String r2 = "Unparseable port number: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r6)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L55
            boolean r0 = isValidPort(r1)
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r6)
            goto L6c
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unparseable port number: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L6c:
            com.google.common.net.HostAndPort r6 = new com.google.common.net.HostAndPort
            r6.<init>(r4, r1, r3)
            return r6
    }

    private static java.lang.String[] getHostAndPortFromBracketedHost(java.lang.String r7) {
            r0 = 0
            char r1 = r7.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            java.lang.String r2 = "Bracketed host-port string must start with a bracket: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r2, r7)
            r1 = 58
            int r2 = r7.indexOf(r1)
            r4 = 93
            int r4 = r7.lastIndexOf(r4)
            r5 = -1
            if (r2 <= r5) goto L25
            if (r4 <= r2) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            java.lang.String r5 = "Invalid bracketed host/port: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r5, r7)
            java.lang.String r2 = r7.substring(r3, r4)
            int r5 = r4 + 1
            int r6 = r7.length()
            if (r5 != r6) goto L3e
            java.lang.String r7 = ""
            java.lang.String[] r7 = new java.lang.String[]{r2, r7}
            return r7
        L3e:
            char r5 = r7.charAt(r5)
            if (r5 != r1) goto L45
            r0 = 1
        L45:
            java.lang.String r1 = "Only a colon may follow a close bracket: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r1, r7)
            int r4 = r4 + 2
            r0 = r4
        L4d:
            int r1 = r7.length()
            if (r0 >= r1) goto L63
            char r1 = r7.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            java.lang.String r3 = "Port must be numeric: %s"
            com.google.common.base.Preconditions.checkArgument(r1, r3, r7)
            int r0 = r0 + 1
            goto L4d
        L63:
            java.lang.String r7 = r7.substring(r4)
            java.lang.String[] r7 = new java.lang.String[]{r2, r7}
            return r7
    }

    private static boolean isValidPort(int r1) {
            if (r1 < 0) goto L9
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.common.net.HostAndPort
            r2 = 0
            if (r1 == 0) goto L1c
            com.google.common.net.HostAndPort r5 = (com.google.common.net.HostAndPort) r5
            java.lang.String r1 = r4.host
            java.lang.String r3 = r5.host
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L1c
            int r1 = r4.port
            int r5 = r5.port
            if (r1 != r5) goto L1c
            return r0
        L1c:
            return r2
    }

    public java.lang.String getHost() {
            r1 = this;
            java.lang.String r0 = r1.host
            return r0
    }

    public int getPort() {
            r1 = this;
            boolean r0 = r1.hasPort()
            com.google.common.base.Preconditions.checkState(r0)
            int r0 = r1.port
            return r0
    }

    public int getPortOrDefault(int r2) {
            r1 = this;
            boolean r0 = r1.hasPort()
            if (r0 == 0) goto L8
            int r2 = r1.port
        L8:
            return r2
    }

    public boolean hasPort() {
            r1 = this;
            int r0 = r1.port
            if (r0 < 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.host
            int r1 = r4.port
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = com.google.common.base.Objects.hashCode(r2)
            return r0
    }

    public com.google.common.net.HostAndPort requireBracketsForIPv6() {
            r3 = this;
            boolean r0 = r3.hasBracketlessColons
            r0 = r0 ^ 1
            java.lang.String r1 = "Possible bracketless IPv6 literal: %s"
            java.lang.String r2 = r3.host
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.host
            int r1 = r1.length()
            int r1 = r1 + 8
            r0.<init>(r1)
            java.lang.String r1 = r3.host
            r2 = 58
            int r1 = r1.indexOf(r2)
            if (r1 < 0) goto L27
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r3.host
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L2c
        L27:
            java.lang.String r1 = r3.host
            r0.append(r1)
        L2c:
            boolean r1 = r3.hasPort()
            if (r1 == 0) goto L3a
            r0.append(r2)
            int r1 = r3.port
            r0.append(r1)
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.google.common.net.HostAndPort withDefaultPort(int r4) {
            r3 = this;
            boolean r0 = isValidPort(r4)
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r3.hasPort()
            if (r0 == 0) goto Le
            return r3
        Le:
            com.google.common.net.HostAndPort r0 = new com.google.common.net.HostAndPort
            java.lang.String r1 = r3.host
            boolean r2 = r3.hasBracketlessColons
            r0.<init>(r1, r4, r2)
            return r0
    }
}
