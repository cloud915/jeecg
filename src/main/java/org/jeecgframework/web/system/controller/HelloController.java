package org.jeecgframework.web.system.controller;

import com.jeecg.demo.entity.JeecgDemoEntity;
import com.jeecg.demo.entity.TSDocument;
import org.jeecgframework.core.common.model.common.UploadFile;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.util.DateUtils;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.web.system.pojo.base.TSType;
import org.jeecgframework.web.system.pojo.base.TSTypegroup;
import org.jeecgframework.web.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Description
 * @Author ghy
 * @Date 2019/7/5 11:18
 */
@Controller
@RequestMapping("/helloController")
public class HelloController {

    @Autowired
    private SystemService systemService;

    @RequestMapping(params = "index", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("hello/index");
        //mv.addObject("msg", "world");
        return mv;
    }

    @RequestMapping(params = "index", method = RequestMethod.POST)
    public ModelAndView index(MultipartHttpServletRequest request,
                              String path) {

        ModelAndView mv = new ModelAndView("hello/index");

        //logger.info("后台上传文件");
        //AjaxJson j = new AjaxJson();
        String fileName = null;
        String ctxPath = request.getSession().getServletContext().getRealPath(path);
        File file = new File(ctxPath);
        if (!file.exists()) {
            file.mkdir();// 创建文件根目录
        }
        Map<String, MultipartFile> fileMap = request.getFileMap();
        for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
            MultipartFile mf = entity.getValue();// 获取上传文件对象
            fileName = mf.getOriginalFilename();// 获取文件名
            String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            String newFileName = df.format(new Date()) + "_" + new Random().nextInt(1000) + "." + fileExt;
            String savePath = file.getPath() + "/" + newFileName;// 上传后的文件绝对路径
            System.out.println("上传后路径：" + savePath);
            File savefile = new File(savePath);
            try {
                // String imageUrl = "http://" + request.getServerName() + ":" + request.getLocalPort() + request.getContextPath() + path + "/" + newFileName;
                String imageUrl = request.getContextPath() + path + "/" + newFileName;
                //logger.info("输出路径：" + imageUrl);
                mf.transferTo(savefile);
                //j.setObj(imageUrl);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //j.setMsg("上传成功");
        //return j;

        return mv;
    }


    /**
     * minidao测试
     * @param jeecgDemo 查询条件
     * @param request
     * @param response
     * @param dataGrid datagruid控件参数
     */
    @RequestMapping(params = "minidaoDatagrid")
    public void minidaoDatagrid(JeecgDemoEntity jeecgDemo, HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {

    }
}
