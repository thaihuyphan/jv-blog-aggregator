package vn.co.huypt.isba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.co.huypt.isba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
}
