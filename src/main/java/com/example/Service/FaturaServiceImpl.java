
package com.example.Service;

import com.example.Dao.FaturaDao;
import com.example.Model.Fatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
public class FaturaServiceImpl implements FaturaService {
    private final FaturaDao faturaDao;

     @Autowired
    public FaturaServiceImpl(FaturaDao faturaDao) {
        this.faturaDao = faturaDao;
     }

    @Override
    public Fatura getFatura(Long id) {
         return faturaDao.findOne(id);
    }

     public void init(){
         Fatura f1=new Fatura("Mehmet Arı1", "Hasan Ali Sönmez","15-01-2016" ,750);
         Fatura f2=new Fatura("ASD asda", "Hqwewqe qwewqe","15-01-2016" ,750);
         Fatura f3=new Fatura("qweqwe3 qwewqe", "adasda sadsadsa","15-01-2016" ,750);
         Fatura f4=new Fatura("wqeqwe wqeqw ", "sadafefsdfd","15-01-2016" ,750);

         faturaDao.save(f1);
         faturaDao.save(f2);
         faturaDao.save(f3);
         faturaDao.save(f4);
     }
}
