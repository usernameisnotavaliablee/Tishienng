package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MenuKt$iterator$1 implements java.util.Iterator<android.view.MenuItem>, l3.d {
    final /* synthetic */ android.view.Menu $this_iterator;
    private int index;

    MenuKt$iterator$1(android.view.Menu r1) {
            r0 = this;
            r0.$this_iterator = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.index
            android.view.Menu r1 = r2.$this_iterator
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    public android.view.MenuItem next() {
            r3 = this;
            android.view.Menu r0 = r3.$this_iterator
            int r1 = r3.index
            int r2 = r1 + 1
            r3.index = r2
            android.view.MenuItem r0 = r0.getItem(r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ android.view.MenuItem next() {
            r1 = this;
            android.view.MenuItem r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            android.view.Menu r0 = r2.$this_iterator
            int r1 = r2.index
            int r1 = r1 + (-1)
            r2.index = r1
            android.view.MenuItem r1 = r0.getItem(r1)
            if (r1 == 0) goto L18
            int r1 = r1.getItemId()
            r0.removeItem(r1)
            kotlin.n1 r0 = kotlin.n1.a
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L1c
            return
        L1c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
