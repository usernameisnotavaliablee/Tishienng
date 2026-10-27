package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ChannelMatchers {
    private static final io.netty.channel.group.ChannelMatcher ALL_MATCHER = null;
    private static final io.netty.channel.group.ChannelMatcher NON_SERVER_CHANNEL_MATCHER = null;
    private static final io.netty.channel.group.ChannelMatcher SERVER_CHANNEL_MATCHER = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ClassMatcher implements io.netty.channel.group.ChannelMatcher {
        private final java.lang.Class<? extends io.netty.channel.Channel> clazz;

        ClassMatcher(java.lang.Class<? extends io.netty.channel.Channel> r1) {
                r0 = this;
                r0.<init>()
                r0.clazz = r1
                return
        }

        @Override // io.netty.channel.group.ChannelMatcher
        public boolean matches(io.netty.channel.Channel r2) {
                r1 = this;
                java.lang.Class<? extends io.netty.channel.Channel> r0 = r1.clazz
                boolean r2 = r0.isInstance(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CompositeMatcher implements io.netty.channel.group.ChannelMatcher {
        private final io.netty.channel.group.ChannelMatcher[] matchers;

        CompositeMatcher(io.netty.channel.group.ChannelMatcher... r1) {
                r0 = this;
                r0.<init>()
                r0.matchers = r1
                return
        }

        @Override // io.netty.channel.group.ChannelMatcher
        public boolean matches(io.netty.channel.Channel r6) {
                r5 = this;
                io.netty.channel.group.ChannelMatcher[] r0 = r5.matchers
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L13
                r4 = r0[r3]
                boolean r4 = r4.matches(r6)
                if (r4 != 0) goto L10
                return r2
            L10:
                int r3 = r3 + 1
                goto L5
            L13:
                r6 = 1
                return r6
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InstanceMatcher implements io.netty.channel.group.ChannelMatcher {
        private final io.netty.channel.Channel channel;

        InstanceMatcher(io.netty.channel.Channel r1) {
                r0 = this;
                r0.<init>()
                r0.channel = r1
                return
        }

        @Override // io.netty.channel.group.ChannelMatcher
        public boolean matches(io.netty.channel.Channel r2) {
                r1 = this;
                io.netty.channel.Channel r0 = r1.channel
                if (r0 != r2) goto L6
                r2 = 1
                return r2
            L6:
                r2 = 0
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InvertMatcher implements io.netty.channel.group.ChannelMatcher {
        private final io.netty.channel.group.ChannelMatcher matcher;

        InvertMatcher(io.netty.channel.group.ChannelMatcher r1) {
                r0 = this;
                r0.<init>()
                r0.matcher = r1
                return
        }

        @Override // io.netty.channel.group.ChannelMatcher
        public boolean matches(io.netty.channel.Channel r2) {
                r1 = this;
                io.netty.channel.group.ChannelMatcher r0 = r1.matcher
                boolean r2 = r0.matches(r2)
                r2 = r2 ^ 1
                return r2
        }
    }

    static {
            io.netty.channel.group.ChannelMatchers$1 r0 = new io.netty.channel.group.ChannelMatchers$1
            r0.<init>()
            io.netty.channel.group.ChannelMatchers.ALL_MATCHER = r0
            java.lang.Class<io.netty.channel.ServerChannel> r0 = io.netty.channel.ServerChannel.class
            io.netty.channel.group.ChannelMatcher r1 = isInstanceOf(r0)
            io.netty.channel.group.ChannelMatchers.SERVER_CHANNEL_MATCHER = r1
            io.netty.channel.group.ChannelMatcher r0 = isNotInstanceOf(r0)
            io.netty.channel.group.ChannelMatchers.NON_SERVER_CHANNEL_MATCHER = r0
            return
    }

    private ChannelMatchers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.channel.group.ChannelMatcher all() {
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.ALL_MATCHER
            return r0
    }

    public static io.netty.channel.group.ChannelMatcher compose(io.netty.channel.group.ChannelMatcher... r2) {
            int r0 = r2.length
            r1 = 1
            if (r0 < r1) goto L11
            int r0 = r2.length
            if (r0 != r1) goto Lb
            r0 = 0
            r2 = r2[r0]
            return r2
        Lb:
            io.netty.channel.group.ChannelMatchers$CompositeMatcher r0 = new io.netty.channel.group.ChannelMatchers$CompositeMatcher
            r0.<init>(r2)
            return r0
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "matchers must at least contain one element"
            r2.<init>(r0)
            throw r2
    }

    public static io.netty.channel.group.ChannelMatcher invert(io.netty.channel.group.ChannelMatcher r1) {
            io.netty.channel.group.ChannelMatchers$InvertMatcher r0 = new io.netty.channel.group.ChannelMatchers$InvertMatcher
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.group.ChannelMatcher is(io.netty.channel.Channel r1) {
            io.netty.channel.group.ChannelMatchers$InstanceMatcher r0 = new io.netty.channel.group.ChannelMatchers$InstanceMatcher
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.group.ChannelMatcher isInstanceOf(java.lang.Class<? extends io.netty.channel.Channel> r1) {
            io.netty.channel.group.ChannelMatchers$ClassMatcher r0 = new io.netty.channel.group.ChannelMatchers$ClassMatcher
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.group.ChannelMatcher isNonServerChannel() {
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.NON_SERVER_CHANNEL_MATCHER
            return r0
    }

    public static io.netty.channel.group.ChannelMatcher isNot(io.netty.channel.Channel r0) {
            io.netty.channel.group.ChannelMatcher r0 = is(r0)
            io.netty.channel.group.ChannelMatcher r0 = invert(r0)
            return r0
    }

    public static io.netty.channel.group.ChannelMatcher isNotInstanceOf(java.lang.Class<? extends io.netty.channel.Channel> r0) {
            io.netty.channel.group.ChannelMatcher r0 = isInstanceOf(r0)
            io.netty.channel.group.ChannelMatcher r0 = invert(r0)
            return r0
    }

    public static io.netty.channel.group.ChannelMatcher isServerChannel() {
            io.netty.channel.group.ChannelMatcher r0 = io.netty.channel.group.ChannelMatchers.SERVER_CHANNEL_MATCHER
            return r0
    }
}
