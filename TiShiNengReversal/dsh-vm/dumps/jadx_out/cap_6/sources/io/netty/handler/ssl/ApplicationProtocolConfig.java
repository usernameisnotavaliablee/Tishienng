package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ApplicationProtocolConfig {
    public static final io.netty.handler.ssl.ApplicationProtocolConfig DISABLED = null;
    private final io.netty.handler.ssl.ApplicationProtocolConfig.Protocol protocol;
    private final io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedBehavior;
    private final io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior selectorBehavior;
    private final java.util.List<java.lang.String> supportedProtocols;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Protocol extends java.lang.Enum<io.netty.handler.ssl.ApplicationProtocolConfig.Protocol> {
        private static final /* synthetic */ io.netty.handler.ssl.ApplicationProtocolConfig.Protocol[] $VALUES = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.Protocol ALPN = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.Protocol NONE = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.Protocol NPN = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.Protocol NPN_AND_ALPN = null;

        static {
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r0 = new io.netty.handler.ssl.ApplicationProtocolConfig$Protocol
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE = r0
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = new io.netty.handler.ssl.ApplicationProtocolConfig$Protocol
                java.lang.String r3 = "NPN"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN = r1
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = new io.netty.handler.ssl.ApplicationProtocolConfig$Protocol
                java.lang.String r5 = "ALPN"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.ALPN = r3
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r5 = new io.netty.handler.ssl.ApplicationProtocolConfig$Protocol
                java.lang.String r7 = "NPN_AND_ALPN"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NPN_AND_ALPN = r5
                r7 = 4
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r7 = new io.netty.handler.ssl.ApplicationProtocolConfig.Protocol[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.$VALUES = r7
                return
        }

        Protocol(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.ssl.ApplicationProtocolConfig.Protocol valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.ssl.ApplicationProtocolConfig$Protocol> r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r1 = (io.netty.handler.ssl.ApplicationProtocolConfig.Protocol) r1
                return r1
        }

        public static io.netty.handler.ssl.ApplicationProtocolConfig.Protocol[] values() {
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.ssl.ApplicationProtocolConfig$Protocol[] r0 = (io.netty.handler.ssl.ApplicationProtocolConfig.Protocol[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SelectedListenerFailureBehavior extends java.lang.Enum<io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior> {
        private static final /* synthetic */ io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior[] $VALUES = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior ACCEPT = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior CHOOSE_MY_LAST_PROTOCOL = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior FATAL_ALERT = null;

        static {
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = new io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior
                java.lang.String r1 = "ACCEPT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT = r0
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r1 = new io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior
                java.lang.String r3 = "FATAL_ALERT"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.FATAL_ALERT = r1
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = new io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior
                java.lang.String r5 = "CHOOSE_MY_LAST_PROTOCOL"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL = r3
                r5 = 3
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior[] r5 = new io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.$VALUES = r5
                return
        }

        SelectedListenerFailureBehavior(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior> r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r1 = (io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior) r1
                return r1
        }

        public static io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior[] values() {
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior[] r0 = (io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SelectorFailureBehavior extends java.lang.Enum<io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior> {
        private static final /* synthetic */ io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior[] $VALUES = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior CHOOSE_MY_LAST_PROTOCOL = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior FATAL_ALERT = null;
        public static final io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior NO_ADVERTISE = null;

        static {
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r0 = new io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior
                java.lang.String r1 = "FATAL_ALERT"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.FATAL_ALERT = r0
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r1 = new io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior
                java.lang.String r3 = "NO_ADVERTISE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE = r1
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = new io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior
                java.lang.String r5 = "CHOOSE_MY_LAST_PROTOCOL"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL = r3
                r5 = 3
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior[] r5 = new io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.$VALUES = r5
                return
        }

        SelectorFailureBehavior(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior> r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r1 = (io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior) r1
                return r1
        }

        public static io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior[] values() {
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior[] r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior[] r0 = (io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior[]) r0
                return r0
        }
    }

    static {
            io.netty.handler.ssl.ApplicationProtocolConfig r0 = new io.netty.handler.ssl.ApplicationProtocolConfig
            r0.<init>()
            io.netty.handler.ssl.ApplicationProtocolConfig.DISABLED = r0
            return
    }

    private ApplicationProtocolConfig() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.supportedProtocols = r0
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r0 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE
            r1.protocol = r0
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL
            r1.selectorBehavior = r0
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT
            r1.selectedBehavior = r0
            return
    }

    public ApplicationProtocolConfig(io.netty.handler.ssl.ApplicationProtocolConfig.Protocol r1, io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior r2, io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior r3, java.lang.Iterable<java.lang.String> r4) {
            r0 = this;
            java.util.List r4 = io.netty.handler.ssl.ApplicationProtocolUtil.toList(r4)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private ApplicationProtocolConfig(io.netty.handler.ssl.ApplicationProtocolConfig.Protocol r2, io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior r3, io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior r4, java.util.List<java.lang.String> r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "supportedProtocols"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.supportedProtocols = r0
            java.lang.String r0 = "protocol"
            java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r0 = (io.netty.handler.ssl.ApplicationProtocolConfig.Protocol) r0
            r1.protocol = r0
            java.lang.String r0 = "selectorBehavior"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r3 = (io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior) r3
            r1.selectorBehavior = r3
            java.lang.String r3 = "selectedBehavior"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r3 = (io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior) r3
            r1.selectedBehavior = r3
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r3 = io.netty.handler.ssl.ApplicationProtocolConfig.Protocol.NONE
            if (r2 == r3) goto L42
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L3a
            return
        L3a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "supportedProtocols must be not empty"
            r2.<init>(r3)
            throw r2
        L42:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "protocol ("
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ") must not be "
            r4.append(r5)
            r4.append(r3)
            r3 = 46
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    public ApplicationProtocolConfig(io.netty.handler.ssl.ApplicationProtocolConfig.Protocol r1, io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior r2, io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior r3, java.lang.String... r4) {
            r0 = this;
            java.util.List r4 = io.netty.handler.ssl.ApplicationProtocolUtil.toList(r4)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public io.netty.handler.ssl.ApplicationProtocolConfig.Protocol protocol() {
            r1 = this;
            io.netty.handler.ssl.ApplicationProtocolConfig$Protocol r0 = r1.protocol
            return r0
    }

    public io.netty.handler.ssl.ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior() {
            r1 = this;
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior r0 = r1.selectedBehavior
            return r0
    }

    public io.netty.handler.ssl.ApplicationProtocolConfig.SelectorFailureBehavior selectorFailureBehavior() {
            r1 = this;
            io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior r0 = r1.selectorBehavior
            return r0
    }

    public java.util.List<java.lang.String> supportedProtocols() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.supportedProtocols
            return r0
    }
}
