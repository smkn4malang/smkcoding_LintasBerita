package auth.edu.dycode.com.tugasakhir;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{

    public ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position){
        if(position ==0){
            return new FirstHome();
        }else if (position ==1){
            return new SecondContact();
        }else if (position ==2){
            return new FragmentPopuler();
        }
        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount(){
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if(position==0 || position %3== 0 ){
            return "Terkini";
        }else if (position %3==1){
            return "Terpopuler ";
        }else if (position %3==2){
            return "Rekomendasi";
        }
        throw new IllegalStateException("Position not valid");
    }
}
