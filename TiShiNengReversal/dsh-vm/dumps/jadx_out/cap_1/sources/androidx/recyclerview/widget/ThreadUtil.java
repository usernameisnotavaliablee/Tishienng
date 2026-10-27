package androidx.recyclerview.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface ThreadUtil<T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface BackgroundCallback<T> {
        void loadTile(int r1, int r2);

        @android.annotation.SuppressLint({"UnknownNullness"})
        void recycleTile(androidx.recyclerview.widget.TileList.Tile<T> r1);

        void refresh(int r1);

        void updateRange(int r1, int r2, int r3, int r4, int r5);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface MainThreadCallback<T> {
        @android.annotation.SuppressLint({"UnknownNullness"})
        void addTile(int r1, androidx.recyclerview.widget.TileList.Tile<T> r2);

        void removeTile(int r1, int r2);

        void updateItemCount(int r1, int r2);
    }

    androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> getBackgroundProxy(androidx.recyclerview.widget.ThreadUtil.BackgroundCallback<T> r1);

    androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> getMainThreadProxy(androidx.recyclerview.widget.ThreadUtil.MainThreadCallback<T> r1);
}
