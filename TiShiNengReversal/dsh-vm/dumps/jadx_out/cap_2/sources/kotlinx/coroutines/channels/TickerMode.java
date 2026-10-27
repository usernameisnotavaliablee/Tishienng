package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.ObsoleteCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum TickerMode extends java.lang.Enum<kotlinx.coroutines.channels.TickerMode> {
    private static final /* synthetic */ kotlinx.coroutines.channels.TickerMode[] $VALUES = null;
    public static final kotlinx.coroutines.channels.TickerMode FIXED_DELAY = null;
    public static final kotlinx.coroutines.channels.TickerMode FIXED_PERIOD = null;

    private static final /* synthetic */ kotlinx.coroutines.channels.TickerMode[] $values() {
            r0 = 2
            kotlinx.coroutines.channels.TickerMode[] r0 = new kotlinx.coroutines.channels.TickerMode[r0]
            kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.channels.TickerMode r1 = kotlinx.coroutines.channels.TickerMode.FIXED_DELAY
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.channels.TickerMode r0 = new kotlinx.coroutines.channels.TickerMode
            java.lang.String r1 = "FIXED_PERIOD"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.TickerMode.FIXED_PERIOD = r0
            kotlinx.coroutines.channels.TickerMode r0 = new kotlinx.coroutines.channels.TickerMode
            java.lang.String r1 = "FIXED_DELAY"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.channels.TickerMode.FIXED_DELAY = r0
            kotlinx.coroutines.channels.TickerMode[] r0 = $values()
            kotlinx.coroutines.channels.TickerMode.$VALUES = r0
            return
    }

    TickerMode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.channels.TickerMode valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.channels.TickerMode> r0 = kotlinx.coroutines.channels.TickerMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.channels.TickerMode r1 = (kotlinx.coroutines.channels.TickerMode) r1
            return r1
    }

    public static kotlinx.coroutines.channels.TickerMode[] values() {
            kotlinx.coroutines.channels.TickerMode[] r0 = kotlinx.coroutines.channels.TickerMode.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.channels.TickerMode[] r0 = (kotlinx.coroutines.channels.TickerMode[]) r0
            return r0
    }
}
