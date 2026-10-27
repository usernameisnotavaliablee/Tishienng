package com.trello.rxlifecycle2.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum FragmentEvent extends java.lang.Enum<com.trello.rxlifecycle2.android.FragmentEvent> {
    private static final /* synthetic */ com.trello.rxlifecycle2.android.FragmentEvent[] $VALUES = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent ATTACH = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent CREATE = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent CREATE_VIEW = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent DESTROY = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent DESTROY_VIEW = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent DETACH = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent PAUSE = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent RESUME = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent START = null;
    public static final com.trello.rxlifecycle2.android.FragmentEvent STOP = null;

    static {
            com.trello.rxlifecycle2.android.FragmentEvent r0 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r1 = "ATTACH"
            r2 = 0
            r0.<init>(r1, r2)
            com.trello.rxlifecycle2.android.FragmentEvent.ATTACH = r0
            com.trello.rxlifecycle2.android.FragmentEvent r1 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r3 = "CREATE"
            r4 = 1
            r1.<init>(r3, r4)
            com.trello.rxlifecycle2.android.FragmentEvent.CREATE = r1
            com.trello.rxlifecycle2.android.FragmentEvent r3 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r5 = "CREATE_VIEW"
            r6 = 2
            r3.<init>(r5, r6)
            com.trello.rxlifecycle2.android.FragmentEvent.CREATE_VIEW = r3
            com.trello.rxlifecycle2.android.FragmentEvent r5 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r7 = "START"
            r8 = 3
            r5.<init>(r7, r8)
            com.trello.rxlifecycle2.android.FragmentEvent.START = r5
            com.trello.rxlifecycle2.android.FragmentEvent r7 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r9 = "RESUME"
            r10 = 4
            r7.<init>(r9, r10)
            com.trello.rxlifecycle2.android.FragmentEvent.RESUME = r7
            com.trello.rxlifecycle2.android.FragmentEvent r9 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r11 = "PAUSE"
            r12 = 5
            r9.<init>(r11, r12)
            com.trello.rxlifecycle2.android.FragmentEvent.PAUSE = r9
            com.trello.rxlifecycle2.android.FragmentEvent r11 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r13 = "STOP"
            r14 = 6
            r11.<init>(r13, r14)
            com.trello.rxlifecycle2.android.FragmentEvent.STOP = r11
            com.trello.rxlifecycle2.android.FragmentEvent r13 = new com.trello.rxlifecycle2.android.FragmentEvent
            java.lang.String r15 = "DESTROY_VIEW"
            r16 = 0
            r2 = 7
            r13.<init>(r15, r2)
            com.trello.rxlifecycle2.android.FragmentEvent.DESTROY_VIEW = r13
            com.trello.rxlifecycle2.android.FragmentEvent r15 = new com.trello.rxlifecycle2.android.FragmentEvent
            r17 = 7
            java.lang.String r2 = "DESTROY"
            r18 = 1
            r4 = 8
            r15.<init>(r2, r4)
            com.trello.rxlifecycle2.android.FragmentEvent.DESTROY = r15
            com.trello.rxlifecycle2.android.FragmentEvent r2 = new com.trello.rxlifecycle2.android.FragmentEvent
            r19 = 8
            java.lang.String r4 = "DETACH"
            r20 = 2
            r6 = 9
            r2.<init>(r4, r6)
            com.trello.rxlifecycle2.android.FragmentEvent.DETACH = r2
            r4 = 10
            com.trello.rxlifecycle2.android.FragmentEvent[] r4 = new com.trello.rxlifecycle2.android.FragmentEvent[r4]
            r4[r16] = r0
            r4[r18] = r1
            r4[r20] = r3
            r4[r8] = r5
            r4[r10] = r7
            r4[r12] = r9
            r4[r14] = r11
            r4[r17] = r13
            r4[r19] = r15
            r4[r6] = r2
            com.trello.rxlifecycle2.android.FragmentEvent.$VALUES = r4
            return
    }

    FragmentEvent(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.trello.rxlifecycle2.android.FragmentEvent valueOf(java.lang.String r1) {
            java.lang.Class<com.trello.rxlifecycle2.android.FragmentEvent> r0 = com.trello.rxlifecycle2.android.FragmentEvent.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.trello.rxlifecycle2.android.FragmentEvent r1 = (com.trello.rxlifecycle2.android.FragmentEvent) r1
            return r1
    }

    public static com.trello.rxlifecycle2.android.FragmentEvent[] values() {
            com.trello.rxlifecycle2.android.FragmentEvent[] r0 = com.trello.rxlifecycle2.android.FragmentEvent.$VALUES
            java.lang.Object r0 = r0.clone()
            com.trello.rxlifecycle2.android.FragmentEvent[] r0 = (com.trello.rxlifecycle2.android.FragmentEvent[]) r0
            return r0
    }
}
