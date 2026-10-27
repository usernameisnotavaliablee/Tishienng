package org.apache.commons.net.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum IMAPCommand extends java.lang.Enum<org.apache.commons.net.imap.IMAPCommand> {
    private static final /* synthetic */ org.apache.commons.net.imap.IMAPCommand[] $VALUES = null;
    public static final org.apache.commons.net.imap.IMAPCommand APPEND = null;
    public static final org.apache.commons.net.imap.IMAPCommand AUTHENTICATE = null;
    public static final org.apache.commons.net.imap.IMAPCommand CAPABILITY = null;
    public static final org.apache.commons.net.imap.IMAPCommand CHECK = null;
    public static final org.apache.commons.net.imap.IMAPCommand CLOSE = null;
    public static final org.apache.commons.net.imap.IMAPCommand COPY = null;
    public static final org.apache.commons.net.imap.IMAPCommand CREATE = null;
    public static final org.apache.commons.net.imap.IMAPCommand DELETE = null;
    public static final org.apache.commons.net.imap.IMAPCommand EXAMINE = null;
    public static final org.apache.commons.net.imap.IMAPCommand EXPUNGE = null;
    public static final org.apache.commons.net.imap.IMAPCommand FETCH = null;
    public static final org.apache.commons.net.imap.IMAPCommand LIST = null;
    public static final org.apache.commons.net.imap.IMAPCommand LOGIN = null;
    public static final org.apache.commons.net.imap.IMAPCommand LOGOUT = null;
    public static final org.apache.commons.net.imap.IMAPCommand LSUB = null;
    public static final org.apache.commons.net.imap.IMAPCommand NOOP = null;
    public static final org.apache.commons.net.imap.IMAPCommand RENAME = null;
    public static final org.apache.commons.net.imap.IMAPCommand SEARCH = null;
    public static final org.apache.commons.net.imap.IMAPCommand SELECT = null;
    public static final org.apache.commons.net.imap.IMAPCommand STARTTLS = null;
    public static final org.apache.commons.net.imap.IMAPCommand STATUS = null;
    public static final org.apache.commons.net.imap.IMAPCommand STORE = null;
    public static final org.apache.commons.net.imap.IMAPCommand SUBSCRIBE = null;
    public static final org.apache.commons.net.imap.IMAPCommand UID = null;
    public static final org.apache.commons.net.imap.IMAPCommand UNSUBSCRIBE = null;
    public static final org.apache.commons.net.imap.IMAPCommand XOAUTH = null;
    private final java.lang.String imapCommand;
    private final int maxParamCount;
    private final int minParamCount;

    static {
            org.apache.commons.net.imap.IMAPCommand r0 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r1 = "CAPABILITY"
            r2 = 0
            r0.<init>(r1, r2, r2)
            org.apache.commons.net.imap.IMAPCommand.CAPABILITY = r0
            org.apache.commons.net.imap.IMAPCommand r1 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r3 = "NOOP"
            r4 = 1
            r1.<init>(r3, r4, r2)
            org.apache.commons.net.imap.IMAPCommand.NOOP = r1
            org.apache.commons.net.imap.IMAPCommand r3 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r5 = "LOGOUT"
            r6 = 2
            r3.<init>(r5, r6, r2)
            org.apache.commons.net.imap.IMAPCommand.LOGOUT = r3
            org.apache.commons.net.imap.IMAPCommand r5 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r7 = "STARTTLS"
            r8 = 3
            r5.<init>(r7, r8, r2)
            org.apache.commons.net.imap.IMAPCommand.STARTTLS = r5
            org.apache.commons.net.imap.IMAPCommand r7 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r9 = "AUTHENTICATE"
            r10 = 4
            r7.<init>(r9, r10, r4)
            org.apache.commons.net.imap.IMAPCommand.AUTHENTICATE = r7
            org.apache.commons.net.imap.IMAPCommand r9 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r11 = "LOGIN"
            r12 = 5
            r9.<init>(r11, r12, r6)
            org.apache.commons.net.imap.IMAPCommand.LOGIN = r9
            org.apache.commons.net.imap.IMAPCommand r11 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r13 = "XOAUTH"
            r14 = 6
            r11.<init>(r13, r14, r4)
            org.apache.commons.net.imap.IMAPCommand.XOAUTH = r11
            org.apache.commons.net.imap.IMAPCommand r13 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r15 = "SELECT"
            r16 = 5
            r12 = 7
            r13.<init>(r15, r12, r4)
            org.apache.commons.net.imap.IMAPCommand.SELECT = r13
            org.apache.commons.net.imap.IMAPCommand r15 = new org.apache.commons.net.imap.IMAPCommand
            r17 = 7
            java.lang.String r12 = "EXAMINE"
            r18 = 6
            r14 = 8
            r15.<init>(r12, r14, r4)
            org.apache.commons.net.imap.IMAPCommand.EXAMINE = r15
            org.apache.commons.net.imap.IMAPCommand r12 = new org.apache.commons.net.imap.IMAPCommand
            r19 = 8
            java.lang.String r14 = "CREATE"
            r8 = 9
            r12.<init>(r14, r8, r4)
            org.apache.commons.net.imap.IMAPCommand.CREATE = r12
            org.apache.commons.net.imap.IMAPCommand r14 = new org.apache.commons.net.imap.IMAPCommand
            r21 = 9
            java.lang.String r8 = "DELETE"
            r2 = 10
            r14.<init>(r8, r2, r4)
            org.apache.commons.net.imap.IMAPCommand.DELETE = r14
            org.apache.commons.net.imap.IMAPCommand r8 = new org.apache.commons.net.imap.IMAPCommand
            r23 = 10
            java.lang.String r2 = "RENAME"
            r10 = 11
            r8.<init>(r2, r10, r6)
            org.apache.commons.net.imap.IMAPCommand.RENAME = r8
            org.apache.commons.net.imap.IMAPCommand r2 = new org.apache.commons.net.imap.IMAPCommand
            r25 = 11
            java.lang.String r10 = "SUBSCRIBE"
            r6 = 12
            r2.<init>(r10, r6, r4)
            org.apache.commons.net.imap.IMAPCommand.SUBSCRIBE = r2
            org.apache.commons.net.imap.IMAPCommand r10 = new org.apache.commons.net.imap.IMAPCommand
            r27 = 12
            java.lang.String r6 = "UNSUBSCRIBE"
            r28 = r0
            r0 = 13
            r10.<init>(r6, r0, r4)
            org.apache.commons.net.imap.IMAPCommand.UNSUBSCRIBE = r10
            org.apache.commons.net.imap.IMAPCommand r6 = new org.apache.commons.net.imap.IMAPCommand
            r29 = 13
            java.lang.String r0 = "LIST"
            r4 = 14
            r31 = r1
            r1 = 2
            r6.<init>(r0, r4, r1)
            org.apache.commons.net.imap.IMAPCommand.LIST = r6
            org.apache.commons.net.imap.IMAPCommand r0 = new org.apache.commons.net.imap.IMAPCommand
            r32 = 14
            java.lang.String r4 = "LSUB"
            r33 = r2
            r2 = 15
            r0.<init>(r4, r2, r1)
            org.apache.commons.net.imap.IMAPCommand.LSUB = r0
            org.apache.commons.net.imap.IMAPCommand r4 = new org.apache.commons.net.imap.IMAPCommand
            r34 = 15
            java.lang.String r2 = "STATUS"
            r35 = r0
            r0 = 16
            r4.<init>(r2, r0, r1)
            org.apache.commons.net.imap.IMAPCommand.STATUS = r4
            org.apache.commons.net.imap.IMAPCommand r2 = new org.apache.commons.net.imap.IMAPCommand
            r36 = 16
            java.lang.String r0 = "APPEND"
            r37 = r3
            r3 = 17
            r38 = r4
            r4 = 4
            r2.<init>(r0, r3, r1, r4)
            org.apache.commons.net.imap.IMAPCommand.APPEND = r2
            org.apache.commons.net.imap.IMAPCommand r0 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r1 = "CHECK"
            r4 = 18
            r3 = 0
            r39 = 17
            r0.<init>(r1, r4, r3)
            org.apache.commons.net.imap.IMAPCommand.CHECK = r0
            org.apache.commons.net.imap.IMAPCommand r1 = new org.apache.commons.net.imap.IMAPCommand
            r40 = 18
            java.lang.String r4 = "CLOSE"
            r41 = r0
            r0 = 19
            r1.<init>(r4, r0, r3)
            org.apache.commons.net.imap.IMAPCommand.CLOSE = r1
            org.apache.commons.net.imap.IMAPCommand r4 = new org.apache.commons.net.imap.IMAPCommand
            r42 = 19
            java.lang.String r0 = "EXPUNGE"
            r43 = r1
            r1 = 20
            r4.<init>(r0, r1, r3)
            org.apache.commons.net.imap.IMAPCommand.EXPUNGE = r4
            org.apache.commons.net.imap.IMAPCommand r0 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r3 = "SEARCH"
            r44 = 20
            r1 = 21
            r45 = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r46 = r4
            r4 = 1
            r0.<init>(r3, r1, r4, r2)
            org.apache.commons.net.imap.IMAPCommand.SEARCH = r0
            org.apache.commons.net.imap.IMAPCommand r3 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r4 = "FETCH"
            r47 = 21
            r1 = 22
            r2 = 2
            r3.<init>(r4, r1, r2)
            org.apache.commons.net.imap.IMAPCommand.FETCH = r3
            org.apache.commons.net.imap.IMAPCommand r1 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r4 = "STORE"
            r2 = 23
            r48 = r0
            r0 = 3
            r1.<init>(r4, r2, r0)
            org.apache.commons.net.imap.IMAPCommand.STORE = r1
            org.apache.commons.net.imap.IMAPCommand r0 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r2 = "COPY"
            r4 = 24
            r49 = r1
            r1 = 2
            r0.<init>(r2, r4, r1)
            org.apache.commons.net.imap.IMAPCommand.COPY = r0
            org.apache.commons.net.imap.IMAPCommand r2 = new org.apache.commons.net.imap.IMAPCommand
            java.lang.String r4 = "UID"
            r26 = r0
            r0 = 25
            r50 = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r4, r0, r1, r3)
            org.apache.commons.net.imap.IMAPCommand.UID = r2
            r0 = 26
            org.apache.commons.net.imap.IMAPCommand[] r0 = new org.apache.commons.net.imap.IMAPCommand[r0]
            r22 = 0
            r0[r22] = r28
            r30 = 1
            r0[r30] = r31
            r0[r1] = r37
            r20 = 3
            r0[r20] = r5
            r24 = 4
            r0[r24] = r7
            r0[r16] = r9
            r0[r18] = r11
            r0[r17] = r13
            r0[r19] = r15
            r0[r21] = r12
            r0[r23] = r14
            r0[r25] = r8
            r0[r27] = r33
            r0[r29] = r10
            r0[r32] = r6
            r0[r34] = r35
            r0[r36] = r38
            r0[r39] = r45
            r0[r40] = r41
            r0[r42] = r43
            r0[r44] = r46
            r0[r47] = r48
            r1 = 22
            r0[r1] = r50
            r1 = 23
            r0[r1] = r49
            r1 = 24
            r0[r1] = r26
            r1 = 25
            r0[r1] = r2
            org.apache.commons.net.imap.IMAPCommand.$VALUES = r0
            return
    }

    IMAPCommand(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    IMAPCommand(java.lang.String r7, int r8, int r9) {
            r6 = this;
            r3 = 0
            r5 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    IMAPCommand(java.lang.String r7, int r8, int r9, int r10) {
            r6 = this;
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    IMAPCommand(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    IMAPCommand(java.lang.String r7, int r8, java.lang.String r9, int r10) {
            r6 = this;
            r5 = r10
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    IMAPCommand(java.lang.String r1, int r2, java.lang.String r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.imapCommand = r3
            r0.minParamCount = r4
            r0.maxParamCount = r5
            return
    }

    public static final java.lang.String getCommand(org.apache.commons.net.imap.IMAPCommand r0) {
            java.lang.String r0 = r0.getIMAPCommand()
            return r0
    }

    public static org.apache.commons.net.imap.IMAPCommand valueOf(java.lang.String r1) {
            java.lang.Class<org.apache.commons.net.imap.IMAPCommand> r0 = org.apache.commons.net.imap.IMAPCommand.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.apache.commons.net.imap.IMAPCommand r1 = (org.apache.commons.net.imap.IMAPCommand) r1
            return r1
    }

    public static org.apache.commons.net.imap.IMAPCommand[] values() {
            org.apache.commons.net.imap.IMAPCommand[] r0 = org.apache.commons.net.imap.IMAPCommand.$VALUES
            java.lang.Object r0 = r0.clone()
            org.apache.commons.net.imap.IMAPCommand[] r0 = (org.apache.commons.net.imap.IMAPCommand[]) r0
            return r0
    }

    public java.lang.String getIMAPCommand() {
            r1 = this;
            java.lang.String r0 = r1.imapCommand
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r1.name()
            return r0
    }
}
