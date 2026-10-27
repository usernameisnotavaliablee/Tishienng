package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum SharingCommand extends java.lang.Enum<kotlinx.coroutines.flow.SharingCommand> {
    private static final /* synthetic */ kotlinx.coroutines.flow.SharingCommand[] $VALUES = null;
    public static final kotlinx.coroutines.flow.SharingCommand START = null;
    public static final kotlinx.coroutines.flow.SharingCommand STOP = null;
    public static final kotlinx.coroutines.flow.SharingCommand STOP_AND_RESET_REPLAY_CACHE = null;

    private static final /* synthetic */ kotlinx.coroutines.flow.SharingCommand[] $values() {
            r0 = 3
            kotlinx.coroutines.flow.SharingCommand[] r0 = new kotlinx.coroutines.flow.SharingCommand[r0]
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START
            r2 = 0
            r0[r2] = r1
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP
            r2 = 1
            r0[r2] = r1
            kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlinx.coroutines.flow.SharingCommand r0 = new kotlinx.coroutines.flow.SharingCommand
            java.lang.String r1 = "START"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharingCommand.START = r0
            kotlinx.coroutines.flow.SharingCommand r0 = new kotlinx.coroutines.flow.SharingCommand
            java.lang.String r1 = "STOP"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharingCommand.STOP = r0
            kotlinx.coroutines.flow.SharingCommand r0 = new kotlinx.coroutines.flow.SharingCommand
            java.lang.String r1 = "STOP_AND_RESET_REPLAY_CACHE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE = r0
            kotlinx.coroutines.flow.SharingCommand[] r0 = $values()
            kotlinx.coroutines.flow.SharingCommand.$VALUES = r0
            return
    }

    SharingCommand(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlinx.coroutines.flow.SharingCommand valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.flow.SharingCommand> r0 = kotlinx.coroutines.flow.SharingCommand.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
            return r1
    }

    public static kotlinx.coroutines.flow.SharingCommand[] values() {
            kotlinx.coroutines.flow.SharingCommand[] r0 = kotlinx.coroutines.flow.SharingCommand.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.flow.SharingCommand[] r0 = (kotlinx.coroutines.flow.SharingCommand[]) r0
            return r0
    }
}
