package kr.ddfactory.bwelove;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

/**
 * Created by dw.Seo on 2017-09-25.
 * Architecture Test ViewModel. BusListViewModel
 */

public class BusListViewModel extends ViewModel {
//    private BusRepository busRepository;
//
//    private MutableLiveData<BusEntity> selectedItem;
//    private LiveData<List<BusEntity>> busList;
//
//    public BusListViewModel(@Nullable BusRepository busRepository) {
//        if (this.busRepository != null) {
//            // ViewModel is created per Activity, so instantiate once
//            // we know the userId won't change
//            return;
//        }
//        if (busRepository != null) {
//            this.busRepository = busRepository;
//        }
//    }
//
//    public void onFabButtonClicked() {
//        // As an example we'll create some data
//        DatabaseMockUtils.populateMockDataAsync(DatabaseCreator.getInstance().getDatabase());
//    }
//
//    public void onPullRequested() {
//        busRepository.loadListNewData();
//    }
//
//    public void onListItemClicked(BusEntity bus) {
//        if (selectedItem.getValue() == bus) {
//            return;
//        }
//        // At the moment this does nothing but would be a way to communicate changes to other
//        // views (e.g. fragment) that subscribed to this listener.
//        selectedItem.postValue(bus);
//    }
//
//    public LiveData<List<BusEntity>> getBusList() {
//        if (busList == null) {
//            busList = new MutableLiveData<>();
//            loadBuses();
//        }
//        return busList;
//    }
//
//    public LiveData<BusEntity> getSelectedItem() {
//        if (selectedItem == null) {
//            selectedItem = new MutableLiveData<>();
//        }
//        return selectedItem;
//    }
//
//    private void loadBuses() {
//        // Observe if/when database is created.
//        busList = Transformations.switchMap(DatabaseCreator.getInstance().isDatabaseCreated(),
//                new Function<Boolean, LiveData<List<BusEntity>>>() {
//                    @Override
//                    public LiveData<List<BusEntity>> apply(Boolean isDbCreated) {
//                        if (Boolean.TRUE.equals(isDbCreated)) {
//                            return busListRepository.loadList();
//                        }
//                        return null;
//                    }
//                });
//    }
//
//    /**
//     * This creator is to showcase how to inject dependencies into ViewModels. It's not
//     * actually necessary in this case, as the BusRepository can be passed in a public method.
//     */
//    static class Factory extends ViewModelProvider.NewInstanceFactory {
//
//        private BusRepository mBusRepository;
//
//        public Factory() {
//        }
//
//        public Factory(@NonNull BusRepository busRepository) {
//            mBusRepository = busRepository;
//        }
//
//        @Override
//        public <T extends ViewModel> T create(Class<T> modelClass) {
//            //noinspection unchecked
//            return (T) new BusListViewModel(mBusRepository);
//        }
//    }
}
