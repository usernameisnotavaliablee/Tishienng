package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class PeerCredentials {
    private final int[] gids;
    private final int pid;
    private final int uid;

    PeerCredentials(int r1, int r2, int... r3) {
            r0 = this;
            r0.<init>()
            r0.pid = r1
            r0.uid = r2
            if (r3 != 0) goto Lb
            int[] r3 = io.netty.util.internal.EmptyArrays.EMPTY_INTS
        Lb:
            r0.gids = r3
            return
    }

    public int[] gids() {
            r1 = this;
            int[] r0 = r1.gids
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            return r0
    }

    public int pid() {
            r1 = this;
            int r0 = r1.pid
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "UserCredentials[pid="
            r0.append(r1)
            int r1 = r3.pid
            r0.append(r1)
            java.lang.String r1 = "; uid="
            r0.append(r1)
            int r1 = r3.uid
            r0.append(r1)
            java.lang.String r1 = "; gids=["
            r0.append(r1)
            int[] r1 = r3.gids
            int r2 = r1.length
            if (r2 <= 0) goto L40
            r2 = 0
            r1 = r1[r2]
            r0.append(r1)
            r1 = 1
        L2c:
            int[] r2 = r3.gids
            int r2 = r2.length
            if (r1 >= r2) goto L40
            java.lang.String r2 = ", "
            r0.append(r2)
            int[] r2 = r3.gids
            r2 = r2[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L2c
        L40:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int uid() {
            r1 = this;
            int r0 = r1.uid
            return r0
    }
}
