package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DragSourceEventProxy implements java.lang.Runnable {
    public static final int DRAG_ACTION_CHANGED = 3;
    public static final int DRAG_DROP_END = 6;
    public static final int DRAG_ENTER = 1;
    public static final int DRAG_EXIT = 5;
    public static final int DRAG_MOUSE_MOVED = 4;
    public static final int DRAG_OVER = 2;
    private final java.awt.dnd.DragSourceContext context;
    private final int modifiers;
    private final boolean success;
    private final int targetActions;
    private final int type;
    private final int userAction;
    private final int x;
    private final int y;

    public DragSourceEventProxy(java.awt.dnd.DragSourceContext r1, int r2, int r3, int r4, java.awt.Point r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.type = r2
            r0.userAction = r3
            r0.targetActions = r4
            int r1 = r5.x
            r0.x = r1
            int r1 = r5.y
            r0.y = r1
            r0.modifiers = r6
            r1 = 0
            r0.success = r1
            return
    }

    public DragSourceEventProxy(java.awt.dnd.DragSourceContext r1, int r2, int r3, boolean r4, java.awt.Point r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.type = r2
            r0.userAction = r3
            r0.targetActions = r3
            int r1 = r5.x
            r0.x = r1
            int r1 = r5.y
            r0.y = r1
            r0.modifiers = r6
            r0.success = r4
            return
    }

    private java.awt.dnd.DragSourceDragEvent newDragSourceDragEvent() {
            r7 = this;
            java.awt.dnd.DragSourceDragEvent r0 = new java.awt.dnd.DragSourceDragEvent
            java.awt.dnd.DragSourceContext r1 = r7.context
            int r2 = r7.userAction
            int r3 = r7.targetActions
            int r4 = r7.modifiers
            int r5 = r7.x
            int r6 = r7.y
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            int r0 = r7.type
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L40;
                case 3: goto L36;
                case 4: goto L2c;
                case 5: goto L1b;
                case 6: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.awt.dnd.DragSourceContext r0 = r7.context
            java.awt.dnd.DragSourceDropEvent r1 = new java.awt.dnd.DragSourceDropEvent
            java.awt.dnd.DragSourceContext r2 = r7.context
            int r3 = r7.userAction
            boolean r4 = r7.success
            int r5 = r7.x
            int r6 = r7.y
            r1.<init>(r2, r3, r4, r5, r6)
            r0.dragExit(r1)
            return
        L1b:
            java.awt.dnd.DragSourceContext r0 = r7.context
            java.awt.dnd.DragSourceEvent r1 = new java.awt.dnd.DragSourceEvent
            java.awt.dnd.DragSourceContext r2 = r7.context
            int r3 = r7.x
            int r4 = r7.y
            r1.<init>(r2, r3, r4)
            r0.dragExit(r1)
            return
        L2c:
            java.awt.dnd.DragSourceContext r0 = r7.context
            java.awt.dnd.DragSourceDragEvent r1 = r7.newDragSourceDragEvent()
            r0.dragMouseMoved(r1)
            return
        L36:
            java.awt.dnd.DragSourceContext r0 = r7.context
            java.awt.dnd.DragSourceDragEvent r1 = r7.newDragSourceDragEvent()
            r0.dropActionChanged(r1)
            return
        L40:
            java.awt.dnd.DragSourceContext r0 = r7.context
            java.awt.dnd.DragSourceDragEvent r1 = r7.newDragSourceDragEvent()
            r0.dragOver(r1)
            return
        L4a:
            java.awt.dnd.DragSourceContext r0 = r7.context
            java.awt.dnd.DragSourceDragEvent r1 = r7.newDragSourceDragEvent()
            r0.dragEnter(r1)
            return
    }
}
